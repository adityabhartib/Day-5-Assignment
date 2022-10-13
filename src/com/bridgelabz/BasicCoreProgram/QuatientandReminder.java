package com.bridgelabz.BasicCoreProgram;

import java.util.Scanner;

public class QuatientandReminder {
    static void QuatienrReminder(int divisor,int dividend) {
        int quatient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quatient = " + quatient);
        System.out.println("Remainder = " + remainder);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Divisor: ");
        int quatient=scan.nextInt();
        System.out.println("Enter Dividend: ");
        int reminder=scan.nextInt();
        QuatienrReminder(quatient,reminder);

    }
}
