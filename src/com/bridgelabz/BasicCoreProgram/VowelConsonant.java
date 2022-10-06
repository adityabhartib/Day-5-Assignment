package com.bridgelabz.BasicCoreProgram;

import java.util.Scanner;

public class VowelConsonant {
    static void checkVowel(char ch){
        if (ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        System.out.println(ch+" is Vowel");
        else
            System.out.println(ch+" is Consonant");
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Alphabet: ");
        char ch=scan.next().charAt(0);
        checkVowel(ch);
    }
}
