package com.anjali.Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ConcatenateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = in.nextInt();

        ArrayList<Integer> inputArray = new ArrayList<>(size);

        System.out.print("Input: ");
        for (int i = 0; i < size; i++) {
            inputArray.add(in.nextInt());
        }

        System.out.println("Input array: " + inputArray);

        ArrayList<Integer> ansArray = new ArrayList<>(2*size);

        for (int i = 0; i < 2*size; i++) {
            if(i >= size)
                ansArray.add(inputArray.get(i-size));
            else
                ansArray.add(inputArray.get(i));
        }

        System.out.println("ansArray: " + ansArray);
    }
}
