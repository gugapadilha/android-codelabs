package com.example.forage.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.forage.BaseApplication
import com.example.forage.R
import com.example.forage.databinding.FragmentForageableDetailBinding
import com.example.forage.model.Forageable
import com.example.forage.ui.viewmodel.ForageableViewModel
import com.example.forage.ui.viewmodel.ForageableViewModelFactory

/**
 * A fragment to display the details of a [Forageable] currently stored in the database.
 * The [AddForageableFragment] can be launched from this fragment to edit the [Forageable]
 */
class ForageableDetailFragment : Fragment() {

    private val navigationArgs: ForageableDetailFragmentArgs by navArgs()

    // TODO: Refactor the creation of the view model to take an instance of
    //  ForageableViewModelFactory. The factory should take an instance of the Database retrieved
    //  from BaseApplication

    private val viewModel: ForageableViewModel by activityViewModels {
        ForageableViewModelFactory(
            (activity?.application as BaseApplication).database.forageableDao()
        )
    }

    private var _binding: FragmentForageableDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentForageableDetailBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // TODO: Observe a forageable that is retrieved by id, set the forageable variable,
        //  and call the bind forageable method
        viewModel.getForageable(navigationArgs.id).observe(this.viewLifecycleOwner) {
            bindForageable(it)
        }
    }

    private fun bindForageable(forageable : Forageable) {
        binding.apply {
            name.text = forageable.name
            location.text = forageable.address
            notes.text = forageable.notes
            if (forageable.inSeason) {
                season.text = getString(R.string.in_season)
            } else {
                season.text = getString(R.string.out_of_season)
            }
            editForageableFab.setOnClickListener {
                val action = ForageableDetailFragmentDirections
                    .actionForageableDetailFragmentToAddForageableFragment(forageable.id)
                findNavController().navigate(action)
            }

            location.setOnClickListener {
                launchMap(forageable)
            }
        }
    }

    private fun launchMap(forageable : Forageable) {
        val address = forageable.address.let {
            it.replace(", ", ",")
            it.replace(". ", " ")
            it.replace(" ", "+")
        }
        val gmmIntentUri = Uri.parse("geo:0,0?q=$address")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        startActivity(mapIntent)
    }
}