package ru.netology.javaqa.javamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {
    @Test
    public void sumAll() {
        SalesService service = new SalesService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSumSales(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void average() {
        SalesService service = new SalesService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.findAverage(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        SalesService service = new SalesService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        int actual = service.findMaxSales(sale);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minSales() {
        SalesService service = new SalesService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMinSales(sale);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthsBelowAverage() {
        SalesService service = new SalesService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.countMonthsBelowAverage(sale);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthsAboveAverage() {
        SalesService service = new SalesService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.countMonthsAboveAverage(sale);
        Assertions.assertEquals(expected, actual);
    }
}






