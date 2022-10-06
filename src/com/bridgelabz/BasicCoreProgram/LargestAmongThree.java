package com.bridgelabz.BasicCoreProgram;

import java.util.Scanner;

public class LargestAmongThree {
    static void checkLargestAmongThree(int num1,int num2,int num3){
        if (num1>num2 && num1<num3) {
            System.out.println(num1 + " is Greater");
        } else if (num2>num1 && num3<num2) {
            System.out.println(num2 + " is Greater");
        }else {
            System.out.println(num3+" < is Greater");
        }

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1= scan.nextInt();
        System.out.println("Enter Secand Number: ");
        int num2=scan.nextInt();
        System.out.println("Enter Third Number: ");
        int num3=scan.nextInt();
        checkLargestAmongThree(num1,num2,num3);
    }
}
