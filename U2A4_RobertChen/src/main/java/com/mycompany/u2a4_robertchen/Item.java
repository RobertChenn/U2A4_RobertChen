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
    private double markupPercentage;
    private double regularPrice;
    private double currentDiscount;
    private double currentPrice;
    
    public Item(String sku, String name, String category,
            int quantity, int minQuantity, double vendorPrice, double markupPercentage, double regularPrice, 
            double currentDiscount, double currentPrice) {
        this.sku = sku;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.minQuantity = minQuantity;
        this.vendorPrice = vendorPrice;
        this.markupPercentage = markupPercentage;
        this.regularPrice = regularPrice;
        this.currentDiscount = currentDiscount;
        this.currentPrice = currentPrice;
    }
    
    // Gets the SKU of the item
    public String getSKU() {
        return sku;
    }
    
    // Gets the name of the item
    public String getName() {
        return name;
    }
    
    // Gets the category of the item
    public String getCategory() {
        return category;
    }
    
    // Gets the quantity of the item
    public int getQuantity() {
        return quantity;
    }
    
    // Gets the minimum quantity of the item
    public int getMinQuantity() {
        return minQuantity;
    }
    
    // Gets the vendor price of the item
    public double getVendorPrice() {
        return vendorPrice;
    }
    
    // Gets the markup percentage of the item
    public double getMarkupPercentage() {
        return markupPercentage;
    }
    
    // Gets the currrent discount percentage of the item
    public double getCurrentDiscount() {
        return currentDiscount;
    }

    // Sets the regular price of the item
    public double setRegularPrice(double vendorPrice, double markupPercentage) {
        return regularPrice = vendorPrice + (vendorPrice * markupPercentage);
    }
    
    // Sets the current price of the item
    public double setCurrentPrice(double regularPrice, double currentDiscount) {
        return currentPrice = regularPrice - (regularPrice * currentDiscount);
    }
    
    @Override
    public String toString() {
        return sku + "," + name + "," + category + "," + quantity + "," + minQuantity + "," + vendorPrice + 
                "," + markupPercentage + "," + regularPrice + "," + currentDiscount + "," + currentPrice + "\n";
    }
}
