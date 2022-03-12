package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCheckoutBindingImpl extends FragmentCheckoutBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.order_summary, 12);
        sViewsWithIds.put(R.id.divider, 13);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCheckoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentCheckoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.Button) bindings[11]
            , (android.view.View) bindings[13]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            );
        this.accompanimentPrice.setTag(null);
        this.accompanimentSelection.setTag(null);
        this.cancelButton.setTag(null);
        this.entreePrice.setTag(null);
        this.entreeSelection.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.sidePrice.setTag(null);
        this.sideSelection.setTag(null);
        this.submitButton.setTag(null);
        this.subtotal.setTag(null);
        this.tax.setTag(null);
        this.total.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback7 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
        if (BR.checkoutFragment == variableId) {
            setCheckoutFragment((com.example.lunchtray.ui.order.CheckoutFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCheckoutFragment(@Nullable com.example.lunchtray.ui.order.CheckoutFragment CheckoutFragment) {
        this.mCheckoutFragment = CheckoutFragment;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.checkoutFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAccompaniment((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
            case 1 :
                return onChangeViewModelSubtotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelEntree((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
            case 3 :
                return onChangeViewModelTotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelSide((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
            case 5 :
                return onChangeViewModelTax((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAccompaniment(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> ViewModelAccompaniment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSubtotal(androidx.lifecycle.LiveData<java.lang.String> ViewModelSubtotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEntree(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> ViewModelEntree, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTotal(androidx.lifecycle.LiveData<java.lang.String> ViewModelTotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSide(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> ViewModelSide, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTax(androidx.lifecycle.LiveData<java.lang.String> ViewModelTax, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> viewModelAccompaniment = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelSubtotal = null;
        java.lang.String totalAndroidStringTotalViewModelTotal = null;
        java.lang.String viewModelEntreeFormattedPrice = null;
        java.lang.String taxAndroidStringTaxViewModelTax = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelSubtotal = null;
        java.lang.String viewModelTaxGetValue = null;
        com.example.lunchtray.model.MenuItem viewModelEntreeGetValue = null;
        com.example.lunchtray.model.MenuItem viewModelSideGetValue = null;
        java.lang.String viewModelSubtotalGetValue = null;
        com.example.lunchtray.model.MenuItem viewModelAccompanimentGetValue = null;
        com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;
        java.lang.String viewModelSideFormattedPrice = null;
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> viewModelEntree = null;
        java.lang.String viewModelAccompanimentName = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelTotal = null;
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> viewModelSide = null;
        java.lang.String viewModelEntreeName = null;
        java.lang.String viewModelSideName = null;
        java.lang.String viewModelTotalGetValue = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<java.lang.String> viewModelTax = null;
        java.lang.String viewModelAccompanimentFormattedPrice = null;

        if ((dirtyFlags & 0x1bfL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.accompaniment
                        viewModelAccompaniment = viewModel.getAccompaniment();
                    }
                    updateLiveDataRegistration(0, viewModelAccompaniment);


                    if (viewModelAccompaniment != null) {
                        // read viewModel.accompaniment.getValue()
                        viewModelAccompanimentGetValue = viewModelAccompaniment.getValue();
                    }


                    if (viewModelAccompanimentGetValue != null) {
                        // read viewModel.accompaniment.getValue().name
                        viewModelAccompanimentName = viewModelAccompanimentGetValue.getName();
                        // read viewModel.accompaniment.getValue().formattedPrice
                        viewModelAccompanimentFormattedPrice = viewModelAccompanimentGetValue.getFormattedPrice();
                    }
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.subtotal
                        viewModelSubtotal = viewModel.getSubtotal();
                    }
                    updateLiveDataRegistration(1, viewModelSubtotal);


                    if (viewModelSubtotal != null) {
                        // read viewModel.subtotal.getValue()
                        viewModelSubtotalGetValue = viewModelSubtotal.getValue();
                    }


                    // read @android:string/subtotal
                    subtotalAndroidStringSubtotalViewModelSubtotal = subtotal.getResources().getString(R.string.subtotal, viewModelSubtotalGetValue);
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.entree
                        viewModelEntree = viewModel.getEntree();
                    }
                    updateLiveDataRegistration(2, viewModelEntree);


                    if (viewModelEntree != null) {
                        // read viewModel.entree.getValue()
                        viewModelEntreeGetValue = viewModelEntree.getValue();
                    }


                    if (viewModelEntreeGetValue != null) {
                        // read viewModel.entree.getValue().formattedPrice
                        viewModelEntreeFormattedPrice = viewModelEntreeGetValue.getFormattedPrice();
                        // read viewModel.entree.getValue().name
                        viewModelEntreeName = viewModelEntreeGetValue.getName();
                    }
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.total
                        viewModelTotal = viewModel.getTotal();
                    }
                    updateLiveDataRegistration(3, viewModelTotal);


                    if (viewModelTotal != null) {
                        // read viewModel.total.getValue()
                        viewModelTotalGetValue = viewModelTotal.getValue();
                    }


                    // read @android:string/total
                    totalAndroidStringTotalViewModelTotal = total.getResources().getString(R.string.total, viewModelTotalGetValue);
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.side
                        viewModelSide = viewModel.getSide();
                    }
                    updateLiveDataRegistration(4, viewModelSide);


                    if (viewModelSide != null) {
                        // read viewModel.side.getValue()
                        viewModelSideGetValue = viewModelSide.getValue();
                    }


                    if (viewModelSideGetValue != null) {
                        // read viewModel.side.getValue().formattedPrice
                        viewModelSideFormattedPrice = viewModelSideGetValue.getFormattedPrice();
                        // read viewModel.side.getValue().name
                        viewModelSideName = viewModelSideGetValue.getName();
                    }
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.tax
                        viewModelTax = viewModel.getTax();
                    }
                    updateLiveDataRegistration(5, viewModelTax);


                    if (viewModelTax != null) {
                        // read viewModel.tax.getValue()
                        viewModelTaxGetValue = viewModelTax.getValue();
                    }


                    // read @android:string/tax
                    taxAndroidStringTaxViewModelTax = tax.getResources().getString(R.string.tax, viewModelTaxGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.accompanimentPrice, viewModelAccompanimentFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.accompanimentSelection, viewModelAccompanimentName);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback7);
            this.submitButton.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entreePrice, viewModelEntreeFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entreeSelection, viewModelEntreeName);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sidePrice, viewModelSideFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sideSelection, viewModelSideName);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalViewModelSubtotal);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tax, taxAndroidStringTaxViewModelTax);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.total, totalAndroidStringTotalViewModelTotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // checkoutFragment != null
                boolean checkoutFragmentJavaLangObjectNull = false;
                // checkoutFragment
                com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;



                checkoutFragmentJavaLangObjectNull = (checkoutFragment) != (null);
                if (checkoutFragmentJavaLangObjectNull) {


                    checkoutFragment.submitOrder();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // checkoutFragment != null
                boolean checkoutFragmentJavaLangObjectNull = false;
                // checkoutFragment
                com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;



                checkoutFragmentJavaLangObjectNull = (checkoutFragment) != (null);
                if (checkoutFragmentJavaLangObjectNull) {


                    checkoutFragment.cancelOrder();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.accompaniment
        flag 1 (0x2L): viewModel.subtotal
        flag 2 (0x3L): viewModel.entree
        flag 3 (0x4L): viewModel.total
        flag 4 (0x5L): viewModel.side
        flag 5 (0x6L): viewModel.tax
        flag 6 (0x7L): checkoutFragment
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}