package com.revising;

import com.sun.source.tree.BreakTree;

public class Countdown {
    public static void main(String[] args) {

        countDown(12);
        countUp(0);

    }

    public static void countDown(int start) {
        System.out.println("This is where we start" + start);
        while (start != 0) {
            start--;
            System.out.println("This is how much is left " + start);
        }
    }
    public static void countUp (int end) {
        System.out.println("This is where we start " + end);
        while (end >= 0 && end < 20) {
            end++;
            System.out.println("This is how much we got left " + end);
        }
    }
}
