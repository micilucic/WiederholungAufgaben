package com.revising;

public class Switch {
    public static void main(String[] args) {

        System.out.println(getSwitch(4));
        System.out.println(getSwitch1("Grade is fail."));
    }
    public static String getSwitch (int i) {
        return switch (i) {
            case 1 -> "Grade is outstanding.";
            case 2 -> "Grade is excellent.";
            case 3 -> "Grade is acceptable.";
            case 4 -> "Grade is passing.";
            case 5 -> "Grade is fail";
            default -> null;
        };
    }
    public static int getSwitch1 (String gradeExplanation) {
        return switch (gradeExplanation) {
            case "Grade is outstanding." -> 1;
            case "Grade is excellent." -> 2;
            case "Grade is acceptable." -> 3;
            case "Grade is passing." -> 4;
            case "Grade is fail." -> 5;
            default -> 0;
        };
    }
}
