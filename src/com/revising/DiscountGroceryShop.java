package com.revising;

public class DiscountGroceryShop {
    public static void main(String[] args) {
        System.out.println(DiscountGroceries(3, 7));
    }

    public static boolean DiscountGroceries(int alcoDrink, int nonAlcoDrink) {
        boolean discount = true;

        if (alcoDrink == 0 && nonAlcoDrink >= 1) {
            discount = true;
        } else {
            discount = false;
        }
        return discount;
    }

}
