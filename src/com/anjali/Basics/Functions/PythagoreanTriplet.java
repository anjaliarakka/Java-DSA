package com.anjali.Basics.Functions;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (checkPythagoreanTriplet(a,b,c))
            System.out.println("Yes, it is palindrome number");
        else System.out.println("No, it is not Palindrome number");
    }

    static boolean checkPythagoreanTriplet(int a, int b, int c) {
        int max = Math.max(a, Math.max(b,c));
        System.out.println(max);

        if (max == a)
            return max == Math.sqrt(b*b + c*c);
        if (max == b)
            return max == Math.sqrt(a*a + c*c);
        else
            return max == Math.sqrt(a*a + b*b);
    }
}
