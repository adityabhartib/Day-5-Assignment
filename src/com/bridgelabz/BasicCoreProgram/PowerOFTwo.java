package com.bridgelabz.BasicCoreProgram;

import java.util.Scanner;

public class PowerOFTwo {
   static void checkPower(int base,int power){
       long result=1;
       for(int i = 1; i <= power; i++) {
           result = result * base;
       }

       System.out.println( "Power Value  is: " + result);
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int base = sc.nextInt();
        System.out.println("Enter power value: ");
        int power = sc.nextInt();
        checkPower(base,power);

    }

    }

