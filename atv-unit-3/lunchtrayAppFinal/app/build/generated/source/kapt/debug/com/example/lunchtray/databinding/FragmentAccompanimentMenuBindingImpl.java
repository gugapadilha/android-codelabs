package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAccompanimentMenuBindingImpl extends FragmentAccompanimentMenuBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.accompaniment_options, 13);
        sViewsWithIds.put(R.id.divider, 14);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAccompanimentMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentAccompanimentMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.RadioGroup) bindings[13]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[11]
            , (android.view.View) bindings[14]
            , (android.widget.Button) bindings[12]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            );
        this.berries.setTag(null);
        this.berriesDescription.setTag(null);
        this.berriesPrice.setTag(null);
        this.bread.setTag(null);
        this.breadDescription.setTag(null);
        this.breadPrice.setTag(null);
        this.cancelButton.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.pickles.setTag(null);
        this.picklesDescription.setTag(null);
        this.picklesPrice.setTag(null);
        this.subtotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback5 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.accompanimentFragment == variableId) {
            setAccompanimentFragment((com.example.lunchtray.ui.order.AccompanimentMenuFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAccompanimentFragment(@Nullable com.example.lunchtray.ui.order.AccompanimentMenuFragment AccompanimentFragment) {
        this.mAccompanimentFragment = AccompanimentFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.accompanimentFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSubtotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSubtotal(androidx.lifecycle.LiveData<java.lang.String> ViewModelSubtotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.lunchtray.model.MenuItem viewModelMenuItemsBread = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelSubtotal = null;
        java.lang.String viewModelMenuItemsBerriesDescription = null;
        com.example.lunchtray.ui.order.AccompanimentMenuFragment accompanimentFragment = mAccompanimentFragment;
        java.lang.String viewModelMenuItemsPicklesGetFormattedPrice = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelSubtotal = null;
        java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;
        java.lang.String viewModelSubtotalGetValue = null;
        java.lang.String viewModelMenuItemsBreadName = null;
        java.lang.String viewModelMenuItemsBreadDescription = null;
        java.lang.String viewModelMenuItemsBerriesGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsBreadGetFormattedPrice = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsPickles = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsBerries = null;
        java.lang.String viewModelMenuItemsBerriesName = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
        java.lang.String viewModelMenuItemsPicklesName = null;
        java.lang.String viewModelMenuItemsPicklesDescription = null;

        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.subtotal
                    viewModelSubtotal = viewModel.getSubtotal();
                }
                updateLiveDataRegistration(0, viewModelSubtotal);


                if (viewModelSubtotal != null) {
                    // read viewModel.subtotal.getValue()
                    viewModelSubtotalGetValue = viewModelSubtotal.getValue();
                }


                // read @android:string/subtotal
                subtotalAndroidStringSubtotalViewModelSubtotal = subtotal.getResources().getString(R.string.subtotal, viewModelSubtotalGetValue);
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.menuItems
                        viewModelMenuItems = viewModel.getMenuItems();
                    }


                    if (viewModelMenuItems != null) {
                        // read viewModel.menuItems["bread"]
                        viewModelMenuItemsBread = viewModelMenuItems.get("bread");
                        // read viewModel.menuItems["pickles"]
                        viewModelMenuItemsPickles = viewModelMenuItems.get("pickles");
                        // read viewModel.menuItems["berries"]
                        viewModelMenuItemsBerries = viewModelMenuItems.get("berries");
                    }


                    if (viewModelMenuItemsBread != null) {
                        // read viewModel.menuItems["bread"].name
                        viewModelMenuItemsBreadName = viewModelMenuItemsBread.getName();
                        // read viewModel.menuItems["bread"].description
                        viewModelMenuItemsBreadDescription = viewModelMenuItemsBread.getDescription();
                        // read viewModel.menuItems["bread"].getFormattedPrice()
                        viewModelMenuItemsBreadGetFormattedPrice = viewModelMenuItemsBread.getFormattedPrice();
                    }
                    if (viewModelMenuItemsPickles != null) {
                        // read viewModel.menuItems["pickles"].getFormattedPrice()
                        viewModelMenuItemsPicklesGetFormattedPrice = viewModelMenuItemsPickles.getFormattedPrice();
                        // read viewModel.menuItems["pickles"].name
                        viewModelMenuItemsPicklesName = viewModelMenuItemsPickles.getName();
                        // read viewModel.menuItems["pickles"].description
                        viewModelMenuItemsPicklesDescription = viewModelMenuItemsPickles.getDescription();
                    }
                    if (viewModelMenuItemsBerries != null) {
                        // read viewModel.menuItems["berries"].description
                        viewModelMenuItemsBerriesDescription = viewModelMenuItemsBerries.getDescription();
                        // read viewModel.menuItems["berries"].getFormattedPrice()
                        viewModelMenuItemsBerriesGetFormattedPrice = viewModelMenuItemsBerries.getFormattedPrice();
                        // read viewModel.menuItems["berries"].name
                        viewModelMenuItemsBerriesName = viewModelMenuItemsBerries.getName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.berries, viewModelMenuItemsBerriesName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.berriesDescription, viewModelMenuItemsBerriesDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.berriesPrice, viewModelMenuItemsBerriesGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.bread, viewModelMenuItemsBreadName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.breadDescription, viewModelMenuItemsBreadDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.breadPrice, viewModelMenuItemsBreadGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pickles, viewModelMenuItemsPicklesName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.picklesDescription, viewModelMenuItemsPicklesDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.picklesPrice, viewModelMenuItemsPicklesGetFormattedPrice);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.berries.setOnClickListener(mCallback2);
            this.bread.setOnClickListener(mCallback1);
            this.cancelButton.setOnClickListener(mCallback4);
            this.nextButton.setOnClickListener(mCallback5);
            this.pickles.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalViewModelSubtotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // accompanimentFragment
                com.example.lunchtray.ui.order.AccompanimentMenuFragment accompanimentFragment = mAccompanimentFragment;
                // accompanimentFragment != null
                boolean accompanimentFragmentJavaLangObjectNull = false;



                accompanimentFragmentJavaLangObjectNull = (accompanimentFragment) != (null);
                if (accompanimentFragmentJavaLangObjectNull) {


                    accompanimentFragment.cancelOrder();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setAccompaniment("berries");
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // accompanimentFragment
                com.example.lunchtray.ui.order.AccompanimentMenuFragment accompanimentFragment = mAccompanimentFragment;
                // accompanimentFragment != null
                boolean accompanimentFragmentJavaLangObjectNull = false;



                accompanimentFragmentJavaLangObjectNull = (accompanimentFragment) != (null);
                if (accompanimentFragmentJavaLangObjectNull) {


                    accompanimentFragment.goToNextScreen();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setAccompaniment("pickles");
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setAccompaniment("bread");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.subtotal
        flag 1 (0x2L): accompanimentFragment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}