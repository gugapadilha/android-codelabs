package com.example.lunchtray.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020%J\u000e\u0010\'\u001a\u00020%2\u0006\u0010\r\u001a\u00020\u0015J\u000e\u0010(\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u0015J\u000e\u0010)\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u0015J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\tH\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010R\u000e\u0010!\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0010\u00a8\u0006,"}, d2 = {"Lcom/example/lunchtray/model/OrderViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_accompaniment", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/lunchtray/model/MenuItem;", "_entree", "_side", "_subtotal", "", "kotlin.jvm.PlatformType", "_tax", "_total", "accompaniment", "Landroidx/lifecycle/LiveData;", "getAccompaniment", "()Landroidx/lifecycle/LiveData;", "entree", "getEntree", "menuItems", "", "", "getMenuItems", "()Ljava/util/Map;", "previousAccompanimentPrice", "previousEntreePrice", "previousSidePrice", "side", "getSide", "subtotal", "getSubtotal", "tax", "getTax", "taxRate", "total", "getTotal", "calculateTaxAndTotal", "", "resetOrder", "setAccompaniment", "setEntree", "setSide", "updateSubtotal", "itemPrice", "app_debug"})
public final class OrderViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, com.example.lunchtray.model.MenuItem> menuItems = null;
    private double previousEntreePrice = 0.0;
    private double previousSidePrice = 0.0;
    private double previousAccompanimentPrice = 0.0;
    private final double taxRate = 0.08;
    private final androidx.lifecycle.MutableLiveData<com.example.lunchtray.model.MenuItem> _entree = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> entree = null;
    private final androidx.lifecycle.MutableLiveData<com.example.lunchtray.model.MenuItem> _side = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> side = null;
    private final androidx.lifecycle.MutableLiveData<com.example.lunchtray.model.MenuItem> _accompaniment = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> accompaniment = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _subtotal = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> subtotal = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _total = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> total = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _tax = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> tax = null;
    
    public OrderViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, com.example.lunchtray.model.MenuItem> getMenuItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> getEntree() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> getSide() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> getAccompaniment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getSubtotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTax() {
        return null;
    }
    
    /**
     * Set the entree for the order.
     */
    public final void setEntree(@org.jetbrains.annotations.NotNull()
    java.lang.String entree) {
    }
    
    /**
     * Set the side for the order.
     */
    public final void setSide(@org.jetbrains.annotations.NotNull()
    java.lang.String side) {
    }
    
    /**
     * Set the accompaniment for the order.
     */
    public final void setAccompaniment(@org.jetbrains.annotations.NotNull()
    java.lang.String accompaniment) {
    }
    
    /**
     * Update subtotal value.
     */
    private final void updateSubtotal(double itemPrice) {
    }
    
    /**
     * Calculate tax and update total.
     */
    public final void calculateTaxAndTotal() {
    }
    
    /**
     * Reset all values pertaining to the order.
     */
    public final void resetOrder() {
    }
}