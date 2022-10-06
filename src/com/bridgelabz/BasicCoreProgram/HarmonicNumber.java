package com.bridgelabz.BasicCoreProgram;

import java.util.Scanner;

public class HarmonicNumber {
    static void checkHarmonic(int n) {
        double result = 0.0;
        if (n != 0) {
            while (n > 0) {
                result = result + (double) 1 / n;
                n--;
            }
            System.out.println("Total Harmonic Series is " + result);
        } else
            System.out.println("Invalid Number");
    }

    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        checkHarmonic(n);
    }
}