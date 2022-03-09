package com.revising;

public class DiscountBookstore {
    public static void main(String[] args) {

        System.out.println(bookStore(6, 5));
    }

    public static boolean bookStore(int nonFiction, int fiction) {
        boolean discount = true;
        if (nonFiction > 2 && fiction >= 1) {
            discount = true;
        } else {
            discount = false;
        }
        return discount;
    }
}
