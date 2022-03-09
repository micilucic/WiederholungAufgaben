package com.revising;

public class DiscountBus {
    public static void main(String[] args) {
        boolean senior = true;
        boolean dog = true;
        boolean student = true;
        boolean discount = false;

        if (senior) {
            System.out.println("Discount is " + discount);
        } else if (!(dog)) {
                System.out.println("Discount is not " + discount);
            } else {
            System.out.println("Discount is " + discount);
        }
    }
}
