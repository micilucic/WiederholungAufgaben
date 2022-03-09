package com.revising;

public class WinterTires {
    public static void main(String[] args) {
        System.out.println(needWinterTires(5,false));
    }
    public static boolean needWinterTires (int temp, boolean slipperyRoad) {
        if ((temp < 10 && slipperyRoad == true) || temp<4) {
            System.out.println("Please use winter tires");
        } else {
            System.out.println("Winter tires are not required");
        }
        return slipperyRoad;
    }
}
