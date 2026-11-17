/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.exam2025;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author emeris
 */
public class ProductSalesTest {

    // Sample sales data from Q.1.1 
    private final int[][] salesData = {
        {300, 150, 700},
        {250, 200, 600}
    };

    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        ProductSales instance = new ProductSales();
        int expected = 2200;
        int actual = instance.TotalSales(salesData);
        assertEquals(expected, actual);

    }

    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        ProductSales instance = new ProductSales();

        double expected = 366.67;
        double actual = instance.AverageSales(salesData);
        // The 0.01 delta allows for decimal rounding (2200 / 6 = 366.6666...) 
        assertEquals(expected, actual, 0.01);
    }

}
