package com.anjali.Basics.Functions;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (checkPalindrome(number))
            System.out.println("Yes, it is palindrome number");
        else System.out.println("No, it is not Palindrome number");
        /*
          12321 = n
          rem = n%10
          n = n/10

          ans = 0
          ans = ans*10 + rem

          if(ans == n)
          true

          12321 - Yes
          **/
    }

    static boolean checkPalindrome(int number) {
        int originalNumber = number;
        int reverseNumber = 0, lastDigit;

        while(number != 0) {
            lastDigit = number%10;
            reverseNumber = reverseNumber*10 + lastDigit;
            number/=10;
        }
        return reverseNumber == originalNumber;
        }
}
