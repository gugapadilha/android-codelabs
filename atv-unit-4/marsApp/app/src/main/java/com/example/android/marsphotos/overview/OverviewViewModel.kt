package com.example.android.marsphotos.overview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/*** The [ViewModel] that is attached to the [OverviewFragment].*/
class OverviewViewModel : ViewModel() {

    // The internal MutableLiveData that stores the status of the most recent request
    private val _status = MutableLiveData<String>()

    // The external immutable LiveData for the request status
    val status: LiveData<String> = _status

    /**Call getMarsPhotos() on init so we can display status immediately.*/
    init {
        getMarsPhotos()
    }

    /**
     * Gets Mars photos information from the Mars API Retrofit service and updates the*
     * [MarsPhoto] [List] [LiveData].*/
    private fun getMarsPhotos() {
        _status.value = "Set the Mars API status response here!"
    }
}
