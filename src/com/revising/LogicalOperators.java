package com.revising;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean op1 = 6>=8*3;
        boolean op2 = 2-3 < 0;
        boolean op3 = 1*1==1;
        boolean op4 = 1!=1+1;


        System.out.println(op1 && op4);


        System.out.println(1>3 && !(3-1<5) || 2==4*4);

        System.out.println((6>=2*3 || 2-3 < 0) && (1*1==1 && 1 != 1+1));

        boolean op5 = (5 > 3);

        System.out.println(op5);

        System.out.println((5 > 3) && (8 > 5));
        System.out.println(( 5 > 3) && (8 < 5));
        System.out.println(( 5 < 3) || (8 > 5));
        System.out.println(!(5==3));
        System.out.println(!(5*3 < 45));
        System.out.println(!(5>3));
    }
}
