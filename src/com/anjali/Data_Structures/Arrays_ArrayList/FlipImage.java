package com.anjali.Data_Structures.Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FlipImage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int size = in.nextInt();

        ArrayList<ArrayList<Integer>> image = new ArrayList<>(size);

        System.out.print("Matrix: ");
        for (int row = 0; row < size; row++) {
            image.add(new ArrayList<>());
            for (int col = 0; col < size; col++) {
                image.get(row).add(in.nextInt());
            }
        }

        System.out.println("Image: " + image);

        for (ArrayList<Integer> row : image) {
            for (int start=0, end = size-1; start < end; start++, end--) {
                int temp = row.get(start);
                row.set(start, row.get(end));
                row.set(end, temp);
            }
        }

        System.out.println("Flip image: " + image);

        for (ArrayList<Integer> row : image) {
                row.replaceAll(element -> element == 0 ? 1 : 0);
            }

        System.out.println("Invert image: " + image);
    }
}
