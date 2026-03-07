package com.anjali.Basics.Functions;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Number: ");
        int inputNumber = userInput.nextInt();

        if((inputNumber % 5 == 0) && (inputNumber % 3 == 0))
            System.out.println("FizzBuzz");
        else if(inputNumber % 5 == 0)
            System.out.println("Fizz");
        else if (inputNumber % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(inputNumber);
    }
}
