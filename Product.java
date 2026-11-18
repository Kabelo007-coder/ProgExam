/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales;

/**
 *
 * @author Harvard Keyz
 */
    public class Product implements IProduct {
    private final String[] names;      // single array: product names
    private final int[][] sales;       // 2D array: [product][month]

    public Product(String[] names, int[][] sales) {
        this.names = names;
        this.sales = sales;
    }

    // Total sales for one product across all months
    private int getProductTotal(int productIndex) {
        int total = 0;
        for (int month = 0; month < sales[productIndex].length; month++) {
            total += sales[productIndex][month];
        }
        return total;
    }
    //Override ro get the products
    @Override
    public int GetTotalProductSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += getProductTotal(i);
        }
        return total;
    }
    //Override to get average
    @Override
    public double GetAverageProductSold() {
        return (double) GetTotalProductSold() / names.length;
    }
    //Override to get most popular product
    @Override
    public String GetMostPopularProduct() {
        int bestIndex = 0;
        for (int i = 1; i < sales.length; i++) {
            if (getProductTotal(i) > getProductTotal(bestIndex)) {
                bestIndex = i;
            }
        }
        return names[bestIndex];
    }

    public String[] getNames() { return names; }
    public int[][] getSales() { return sales; }
    public int getTotalForProduct(int i) { return getProductTotal(i); }
}

