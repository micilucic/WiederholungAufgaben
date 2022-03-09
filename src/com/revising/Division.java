package com.revising;

public class Division {
    public static void main(String[] args) {

        int firstNumber = 6;
        int secondNumber = 43;

        if (firstNumber%3 == 0 || secondNumber%3 ==0) {
            System.out.println("Nummber is divisible by 3");
        } else {
            System.out.println("Number is not divisible by 3");
        }

        int firstNum = 2;


        // Modulo schreibt man : Zahl1%Zahl2==0
        if (firstNumber%2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
