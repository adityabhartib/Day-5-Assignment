package com.bridgelabz.FunctionalProgram;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] array2 = new int[4][5];

        for (int i = 0; i < array2.length;i++){
            for (int j=0;j<array2[i].length;j++){
                array2[i][j]=i+j;
                System.out.print(array2[i][j]+ " ");
            }
            System.out.println( );
        }
    }
}
