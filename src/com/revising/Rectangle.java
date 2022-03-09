package com.revising;

public class Rectangle {
    public static void main(String[] args) {
       /* int width = 43;
        int lenght = 56;
        int circumference;

        circumference = 2 * (width + lenght);

        System.out.println(circumference);

        int area = width * lenght;

        System.out.println(area); */

        System.out.println(circumference1(56, 66));
        System.out.println(area1(23, 88));
    }

    public static int circumference1 (int width, int lenght) {
        // int circumference = 2 * (width + lenght); - muss man nicht dazuschreiben, einfach nur retrun + die Rechnung)
        //return circumference;
        return  2 * (width + lenght);
    }
    public static int area1 (int width, int lenght) {
        // int area = width * lenght;
        // return area;
        return width * lenght;
    }
}
