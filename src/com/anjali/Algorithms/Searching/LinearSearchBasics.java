package com.anjali.Algorithms.Searching;

import java.util.Arrays;

public class LinearSearchBasics {
    public static void main(String[] args) {
        /*
        * Start searching for each element one-by-one till target element is found
        *
        * If target not found, return -1 index
        *
        * Time Complexity :
        *   Best case: O(1) // constant -> 1 comparison made // 1st element == target
        *   Worst case: O(N) // N -> array size
        *
        * Imp = Ignore Constant in space and time complexity
        *
        * */

        int[] arr = {2,4,6,9,8,4,1,0};
        int target = 0;
        int ans = linearSearch(arr, target);
        System.out.println("ans: " + ans);

        String sentence = "thequickbrownfoxjumpsoverthelazydog" ;
        char targetChar = 'g';
        int found = linearSearchInStrings(sentence, targetChar);
        System.out.println("found: " + found);
        boolean getTarget = linearSearchInStrings2(sentence, targetChar);
        System.out.println("getTarget: " + getTarget);

        int[][] rectangle = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        int targetElement = 1;
        int[] indices = searchInRange(rectangle, targetElement);
        System.out.println("indices: " + Arrays.toString(indices));

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    static int linearSearchInStrings(String str, char target) {
        if (str.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
       return -1;
    }

    static boolean linearSearchInStrings2(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target)
                return true;
        }
        return false;
    }

    static int[] searchInRange(int[][] arr, int target) {
        if (arr.length == 0)
            return new int[]{-1, -1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target)
                    return new int[]{i, j};
            }

        }
        return new int[]{-1, -1};
    }
}
