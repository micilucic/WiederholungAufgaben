package com.revising;

public class Scanner {
    public static void main(String[] args) {

        //Scanner erstellen und benennen
        java.util.Scanner reader = new java.util.Scanner(System.in);
        System.out.println("Enter a number, then press enter: ");

        // muss ein Integer sein wenn am Anfang die Variable als integer definiert wird !!
        int number = reader.nextInt();

        System.out.println("You entered: " + number);
    }

}

