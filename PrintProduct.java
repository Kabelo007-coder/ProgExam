/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales;

/**
 *
 * @author Kabelo Mogale
 */
public class PrintProduct {
    private final Product product;

    public PrintProduct(Product product) {
        this.product = product;
    }

    public void printSalesTable() {
        String[] names = product.getNames();
        int[][] sales = product.getSales();
        System.out.println("\nMONTH MATTRESS SALES REPORT - 2026\n");
        System.out.printf("%-30s %8s %8s %8s %8s%n", "Product", "Month 1", "Month 2", "Month 3", "Total");
        for (int p = 0; p < names.length; p++) {
            System.out.printf("%-30s %8d %8d %8d %8d%n",
                names[p], sales[p][0], sales[p][1], sales[p][2], product.getTotalForProduct(p));
        }
        System.out.println("***************************************************************");
    }

    public void printTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES:        " + product.GetTotalProductSold());
    }

    public void printAverageProductSales() {
        System.out.printf("AVERAGE PRODUCT SOLD:   %.2f%n", product.GetAverageProductSold());
    }

    public void printMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT:       " + product.GetMostPopularProduct());
    }
}
