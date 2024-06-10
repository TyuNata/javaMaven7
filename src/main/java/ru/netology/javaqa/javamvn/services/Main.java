package ru.netology.javaqa.javamvn.services;

public class Main {

    public static void main(String[] args) {

        System.out.println();
    }

    public class SalesService {
        public int calculateSumSales(int[] sales) {
            int sum = 0;
            for (int sale : sales) {
                sum += sale;
            }
            return sum;
        }
    }
}