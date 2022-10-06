package com.bridgelabz.BasicCoreProgram;

import java.util.Scanner;

public class Evenodd {
    static void checkevenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num+" is Even Number");
        } else {
            System.out.println(num+" is odd Number");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scan.nextInt();
        checkevenOdd(num);
    }
}