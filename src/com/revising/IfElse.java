package com.revising;

public class IfElse {
    public static void main(String[] args) {

        light1(12);
    }
    public static int light1 (int light) {
        if (light == 0)  {
            System.out.println("Turn light on.");
        } else {
            System.out.println("Turn light off.");
        }
        return light;
    }
}
