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
    private double markUp;
    private double regularPrice;
    private double discount;
    private double currentPrice;
    
    public Item(String sku, String name, String category,
            int quantity, int minQuantity, double vendorPrice, double markUp, double regularPrice, 
            double discount, double currentPrice) {
        this.sku = sku;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.minQuantity = minQuantity;
        this.vendorPrice = vendorPrice;
        this.markUp = markUp;
        this.regularPrice = regularPrice;
        this.discount = discount;
        this.currentPrice = currentPrice;
    }
    
    @Override
    public String toString() {
        return "SKU: " + sku + ",Name: " + name + ",Category: " + category + ",Quantity: " + quantity
                + ",Minimum Quantity: " + minQuantity + ",Vendor Price: " + vendorPrice + 
                ",Mark Up: " + markUp + ",Regular Price: " + regularPrice + ",Current Discount: " + 
                discount + ",Current Price: " + currentPrice + "\n";
    }
}
