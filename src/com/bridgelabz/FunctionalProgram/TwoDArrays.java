package com.bridgelabz.FunctionalProgram;

import java.util.Scanner;

public class TwoDArrays {
    static  void print2DArray(int m,int n) {
        int[][] array2 = new int[m][n];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = i + j;
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row: ");
        int m= sc.nextInt();
        System.out.println("Enter Collum:" );
        int n= sc.nextInt();
        print2DArray(m,n);
    }
}
