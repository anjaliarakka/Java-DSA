package com.anjali.Data_Structures.Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list = new ArrayList<>(5);

        System.out.println("Enter: ");
        Scanner in = new Scanner(System.in);

        // Input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // Output
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.print(list);

        // Multi-dimensional arraylist

        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();

        // initialization
        for (int i = 0; i < 2; i++) {
         list2D.add(new ArrayList<>());
        }

        // Input
        for (int row = 0; row < 2; row++) {
            list2D.add(new ArrayList<>()); // initialization
            for (int col = 0; col < 3; col++) {
                list2D.get(row).add(in.nextInt());
            }
        }

        // Output
        System.out.println(list2D);

        for (ArrayList<Integer> row : list2D) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
