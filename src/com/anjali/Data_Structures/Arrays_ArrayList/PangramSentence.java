package com.anjali.Data_Structures.Arrays_ArrayList;

import java.util.Scanner;

public class PangramSentence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input sentence: ");
        String sentence = in.next();

        System.out.println("Output: " + checkPangram(sentence));
    }

     static boolean checkPangram(String sentence) {

        // sentence should contain all alphabets
         boolean[] alphabets = new boolean[26];
         for (char c : sentence.toCharArray()) {
             int alphaIndex = c - 'a';
             alphabets[alphaIndex] = true;
         }

         for (boolean alpha: alphabets) {
             if (!alpha) {
                 return false;
             }
         }
         return true;
//         thequickbrownfoxjumpsoverthelazydog - true
     }
    }
