/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exam2025;

/**
 *
 * @author emeris
 */
public class ProductSales implements IProduct{
    
    //Total Sales:
    @Override 
    public int TotalSales(int[][] productSales) { 
        int total = 0; 
        for (int row = 0; row < productSales.length; row++) { 
            for (int col = 0; col < productSales[row].length; col++) {
                total += productSales[row][col]; 
            } 
        } 
        return total; 
    } 
    
    //Average Sales:
    @Override 
    public double AverageSales(int[][] productSales) { 
        int total = TotalSales(productSales); 
        int count = 0; for (int row = 0; 
                row < productSales.length; row++) { 
            count += productSales[row].length; 
        } 
        return count == 0 ? 0 : (double) total / count; 
    } 
    
    //Maximum Sales:
    @Override 
    public int MaxSale(int[][] productSales) { 
        int max = productSales[0][0]; 
        
        for (int row = 0; row < productSales.length; row++) { 
            for (int col = 0; col < productSales[row].length; col++) { 
                
                if (productSales[row][col] > max) { 
                    max = productSales[row][col];
                } 
            } 
        } 
        return max; 
    } 
    //Minimum Sales:
    @Override 
    public int MinSale(int[][] productSales) { 
        int min = productSales[0][0]; 
        for (int row = 0; row < productSales.length; row++) { 
            for (int col = 0; col < productSales[row].length; col++) { 
                if (productSales[row][col] < min) { 
                    min = productSales[row][col]; 
                } 
            } 
        } 
        return min; 
    }
    
}
