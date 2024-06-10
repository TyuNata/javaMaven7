package ru.netology.javaqa.javamvn.services;

public class SalesService {
    public long calculateSumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long findAverage(long[] sales) {
        return calculateSumSales(sales) / sales.length;
    }

    public int findMaxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;

            }
        }
        return maxMonth;
    }

    public int findMinSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;

            }
        }
        return minMonth;
    }

    public long countMonthsBelowAverage(long[] sales) {
        long count = 0;
        long monthBelow = findAverage(sales);
        for (long sale : sales) {
            if (sale < monthBelow) {
                count++;
            }
        }
        return count;
    }

    public long countMonthsAboveAverage(long[] sales) {
        long count = 0;
        long monthAbove = findAverage(sales);
        for (long sale : sales) {
            if (sale > monthAbove) {
                count++;
            }
        }
        return count;
    }
}








