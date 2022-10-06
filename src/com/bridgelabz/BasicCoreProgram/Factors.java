package com.bridgelabz.BasicCoreProgram;


import java.util.Scanner;

public class Factors {
    static void checkfactor(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i+",");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scan.nextInt();
        checkfactor(num);
    }
}