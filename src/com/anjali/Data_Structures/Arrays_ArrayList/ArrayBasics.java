package com.anjali.Data_Structures.Arrays_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr; //declaration
        arr = new int[5]; //initialisation

        //Input
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;
        int[] arr1 = {20, 30, 40, 50, 60}; // initialisation

        //Output
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int j : arr1) {
            System.out.println(j + " ");
        }

        // Multi-dimensional array

        int[][] array2D = new int[2][3];

        // Input
        for (int row=0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[row].length; col++) {
                array2D[row][col] = in.nextInt();
            }
        }

        // Output
        for (int row=0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[row].length; col++) {
                System.out.print(array2D[row][col] + " ");
            }
            System.out.println();
        }

        for (int[] row : array2D) {
            for (int element : row){
                System.out.print(element + " ");
            }
            System.out.println();

//            System.out.println(Arrays.toString(row));
        }

        for (int[] row : array2D) {
            System.out.print(Arrays.toString(row));
            System.out.println();
        }

        System.out.println(Arrays.deepToString(array2D));
    }
}
