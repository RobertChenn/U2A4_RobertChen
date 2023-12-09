/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a4_robertchen;

/**
 *
 * @author 335091559
 */
public class Item {
    private String sku;
    private String name;
    private String category;
    private int quantity;
    private int minQuantity;
    private double vendorPrice;
    private double markupPercetange;
    private double regularPrice;
    private double currentDiscount;
    private double currentPrice;
    
    public Item(String sku, String name, String category,
            int quantity, int minQuantity, double vendorPrice, double markupPercetange, double regularPrice, 
            double currentDiscount, double currentPrice) {
        this.sku = sku;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.minQuantity = minQuantity;
        this.vendorPrice = vendorPrice;
        this.markupPercetange = markupPercetange;
        this.regularPrice = regularPrice;
        this.currentDiscount = currentDiscount;
        this.currentPrice = currentPrice;
    }
    
    // Gets the elements of the items
    public String getSKU() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMinQuantity() {
        return minQuantity;
    }

    public double getVendorPrice() {
        return vendorPrice;
    }

    public double getMarkupPercentage() {
        return markupPercetange;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public double getCurrentDiscount() {
        return currentDiscount;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    // Sets the elements of the items
    public void setSKU(String SKU) {
        this.sku = SKU;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setMinQuantity(int minQuantity) {
        this.minQuantity = minQuantity;
    }

    public void setVendorPrice(double vendorPrice) {
        this.vendorPrice = vendorPrice;
    }

    public void setMarkupPercent(double markupPercetange) {
        this.markupPercetange = markupPercetange;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setCurrentDiscount(double currentDiscount) {
        this.currentDiscount = currentDiscount;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    
    @Override
    public String toString() {
        return sku + "," + name + "," + category + "," + quantity + "," + minQuantity + "," + vendorPrice + 
                "," + markupPercetange + "," + regularPrice + "," + currentDiscount + "," + currentPrice + "\n";
    }
}
