package com.anjali.Data_Structures.Arrays_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = in.nextInt();

        int[][] matrix = new int[rows][columns];
        int[][] transposeMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for (int[] row : matrix) {
//            for (int element : row) {
//                System.out.print(element + " ");
//            }
//            System.out.println();

            System.out.println(Arrays.toString(row));
        }

//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                 if (i != j) {
//                     int temp = matrix[i][j];
//                     matrix[i][j] = matrix[j][i];
//                     matrix[j][i] = temp;
//                 }
//            } // works with arraylist
//        }

//        public int[][] transpose(int[][] matrix) {
//            int[][] ans = new int[matrix[0].length][matrix.length];
//
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[0].length; j++) {
//                    int temp = matrix[i][j];
//                    ans[j][i] = matrix[i][j];
//                    matrix[i][j] = temp;           }
//            }
//            return ans;
//        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                 if (i != j) {
                     transposeMatrix[i][j] = matrix[j][i];
                 }
                 else transposeMatrix[i][j] = matrix[i][j];
            }
        }

        System.out.println("Transpose Matrix: ");
        for (int[] row : transposeMatrix) {
//            for (int element : row) {
//                System.out.print(element + " ");
//            }
//            System.out.println();

            System.out.println(Arrays.toString(row));
        }

    }
}
