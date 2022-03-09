package com.revising;

public class ArithmeticTower {
    public static void main(String[] args) {

        makeTower(33);

        }
    public static void makeTower (int startValue) {
        for (int i = 2; i <=9; i++) {
            System.out.println(startValue + " * " + i);
            startValue = startValue * i;
        }
        for (int i = 2; i <= 9; i++) {
            System.out.println(startValue + " / " + i);
            startValue = startValue / i;
        }
    }
}
