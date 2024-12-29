package org.example;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        /*
        Scanner Class
        Java Scanner class allows the user to take input from the console
        import java.util.*;
        Scanner sc=new Scanner(System.in);
         */
        Scanner sc = new Scanner(System.in); //Creating 'sc' object
        System.out.println("Enter a number = ");
        int num1 = sc.nextInt();
        System.out.println("Enter another number = ");
        int numn2 = sc.nextInt();
        int sum = num1 + numn2;
        System.out.println("Sum = " + sum);


    }
}
