package com.anjali.Basics.Functions;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int factorialValue = factorial(number);
        System.out.println("Factorial: " + factorialValue);
    }

    static int factorial(int number) {
        if(number==1)
            return 1;
        else
            return number*factorial(number-1);
    }
}
