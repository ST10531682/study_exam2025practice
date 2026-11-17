/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exam2025;

/**
 *
 * @author emeris
 */
public class Exam2025 {

    public static void main(String[] args) {
        // Question1.1:
        //2D array storing the product sales data:
        int[][] sales = {
            {300, 150, 700},
            {250, 200, 600}
        };
        
        //Create an Object of ProductSales:
        ProductSales pSales = new ProductSales();
        
        //Single array for labels and calculated values:
        String [] reportLabels = {
            "Total Sales: ",
            "Average Sales: ",
            "Maximum Sale: ",
            "Minimum Sale: "  
        };
        
        int[] reportValues = {
            pSales.TotalSales(sales),
            (int)Math.round(pSales.AverageSales(sales)),
            pSales.MaxSale(sales),
            pSales.MinSale(sales)
          
        };
        
        //Print Formatted report:
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("-------------------------------");
        
        for (int i = 0; i < reportLabels.length; i++) {
            System.out.printf("%-15s %d%n", reportLabels[i], reportValues[i]); //Print Formatter
              
        }
        System.out.println("---------------------------------");
        
    }

}
