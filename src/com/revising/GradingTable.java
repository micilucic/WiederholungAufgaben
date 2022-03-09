package com.revising;

import com.sun.source.tree.BreakTree;

public class GradingTable {
    public static void main(String[] args) {

        System.out.println(grades(33));
    }

    /* Alles was man der Methode gibt befindet sich in Klammern nach dem Namen der Methode, das Ergebniss wird vor der Bedingung definiert ! */
    // Wenn man in der Methode system printout schreibt, muss man im Main nur die Methode aufrufen, sonst sout !


    public static String grades (int points) {
        String gradeName;
        if (points >= 90) {
             gradeName = "Outstanding";
        } else if (points >= 78) {
             gradeName = "Excellent";
        } else if (points >= 65) {
            gradeName = "Acceptable";
        } else if (points >= 51) {
            gradeName = "Passing";
        } else {
            gradeName = "Fail";
        }
        return gradeName;
    }
}
