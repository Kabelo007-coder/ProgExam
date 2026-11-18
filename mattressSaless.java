/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales;
import java.util.Scanner;
/**
 *
 * @author Harvard Keyz
 */
public class mattressSaless {
    

public class MattressSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {
            "Cozy Nights Monarch mattress",
            "Restoric Barbados mattress",
            "Sealy Phuket mattress"
        };
        int months = 3;
        int[][] sales = new int[names.length][months];

        for (int p = 0; p < names.length; p++) {
            System.out.println("Enter sales for " + names[p] + ":");
            for (int m = 0; m < months; m++) {
                int value;
                do {
                    System.out.print("  Month " + (m + 1) + ": ");
                    while (!input.hasNextInt()) {
                        System.out.print("  Please enter a whole number: ");
                        input.next();
                    }
                    value = input.nextInt();
                    if (value < 0) System.out.println("  Sales cannot be negative.");
                } while (value < 0);
                sales[p][m] = value;
            }
        }

        Product product = new Product(names, sales);
        PrintProduct printer = new PrintProduct(product);

        printer.printSalesTable();
        printer.printTotalProductSales();
        printer.printAverageProductSales();
        printer.printMostPopularProduct();

        input.close();
    }
}

}
