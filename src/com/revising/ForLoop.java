package com.revising;

public class ForLoop {
    public static void main(String[] args) {


        System.out.println(summe(1));
    }
    public static int summe (int i) {
        int sum = 0;
        for ( i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
