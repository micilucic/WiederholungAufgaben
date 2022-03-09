package com.revising;

import java.util.Scanner;

public class ScannerLetter {
    public static void main(String[] args) {
        Scanner findLetter = new Scanner(System.in);

        // Scanner findLetter
        // dann unten String letter =findLetter !!!!

        System.out.println("Please enter a letter: ");
        String letter = findLetter.next();

        while (!letter.equals("0")) {
            checkIfVowel(letter);
            System.out.println("Enter the next letter");
             letter = findLetter.next();
        }
    }
    public static void checkIfVowel (String letter) {
        if (letter.equals("a") || letter.equals("o") || letter.equals("u") || letter.equals("e") || letter.equals("i")) {
            System.out.println("The letter " + letter + " is a vowel");
        } else {
            System.out.println("The letter " + letter + " is not a vowel");
        }
    }
}
