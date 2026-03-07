package com.anjali.Data_Structures.Arrays_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[6];

        System.out.print("Enter 6 numbers: ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int[] ans = new int[6];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        System.out.print(Arrays.toString(ans));
    }
}
