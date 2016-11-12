package com.github.wporoslo.javanoob;

/**
 * Created by Wojciech on 12.11.2016.
 */
public class VariableNoob {
    public static void main(String[] args) {
        boolean booleanVariable = true; // albo false
        int intVariable = 1; //liczby całkowite
        System.out.println("Int: " + Integer.MIN_VALUE + ", " + Integer.MAX_VALUE);
        long longVariable = 3L; //całkowite
        System.out.println("Long: " + Long.MIN_VALUE + ", " + Long.MAX_VALUE);
        double doubleVariable = 0.7; //liczby zmiennoprzecinkowe, przechowwyanie o ograniczonej dokładności (float ma jeszcze gorzej), wystarczy *.*
        System.out.println("7/5 = " + (7 / 5));
        System.out.println("7.0/5.0 = " + (7.0 / 5.0));
        System.out.println("doubleVariable = " + doubleVariable);
        doubleVariable = 0.3 + doubleVariable * 5;
        System.out.println("doubleVariable = " + doubleVariable);
        double methodResult = average(multiply(doubleVariable, -2), 0.7, doubleVariable - 1);
        System.out.println("methodResult = " + methodResult);
        char charVariable = 'a';
        charVariable = (char) (charVariable + 1); //kod w ASCII, rzutuje na char
        System.out.println("charVariable = " + charVariable);
        longVariable = 10_000_000_000L;
        intVariable = (int) longVariable; //rzuctowanie, zamienia na int tutaj
        System.out.println("intVariable = " + intVariable);
        String stringVariable = "hello, variables!";
        System.out.println(change(stringVariable));
        System.out.println("stringVariable = " + stringVariable);
    }

    private static double average(double a, double b, double c) {
        double sum = a + b + c;
        double avg = sum / 3.0;
        return avg;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static String change(String str) {
        return str.replace("variable", "noob")
                .toUpperCase();
    }
}