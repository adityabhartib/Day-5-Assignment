package com.bridgelabz.FunctionalProgram;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temprature: "); // in Fahrenheit
        double t = sc.nextDouble();
        System.out.println("Enter Wind Speed: "); // in miles per hour
        double v = sc.nextDouble();
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);
    }
}