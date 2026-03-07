package com.anjali.Flowcharts_Pseudocodes;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = input.next();
        int sum = 0;


        while(!number.equalsIgnoreCase("x")) {
            try {
                int parseNumber = Integer.parseInt(number);
                sum += parseNumber;
                number = input.next();
            } catch (Exception e) {
                System.out.println("Please enter a valid number!!!");
                break;
            }

        }

        System.out.println("Sum is " + sum);

    }
}
