package com.revising;

public class DoCount {
    public static void main(String[] args) {

        doCount(1);
        doCount1(12);
    }

    public static void doCount(int i) {
        System.out.println(i);
        do {
            i++;
            System.out.println(i);
        }
        while (i < 100);
    }
    public static void doCount1 (int a){
        System.out.println(a);
        do {
            a++;
            System.out.println(a);
        } while (a<=15);
    }
}
