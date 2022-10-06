package com.bridgelabz.BasicCoreProgram;

import java.util.Scanner;

public class SwapTwoNumber {
    static void swapNumber(int num1, int num2){
        int temp;
        System.out.println("Before Swaping: "+num1+","+num2);
        temp=num1; //num1=num1+num2;
        num1=num2; //num2=num1-num2;
        num2=temp; //num1=num1-num2;
        System.out.println("After Swaping: "+num1+","+num2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        swapNumber(num1,num2);
    }
}
