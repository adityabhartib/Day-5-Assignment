package com.bridgelabz.FunctionalProgram;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of Y");
        int y = sc.nextInt();

        // compute distance to (0, 0)
        double dist = Math.sqrt(x*x + y*y);

        // output distance
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
}
