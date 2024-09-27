package com.anjali.Algorithms.Searching;

public class BinarySearchBasics {
    public static void main(String[] args) {
        /*
        * Works with sorted array (ascending/descending order)
        *
        * Algorithm:
        *   1) Find the middle element.
        *
        *   2) In Ascending order,
        *       if target > middle, search RHS
        *       else search LHS
        *      In Descending order,
        *       if target > middle, search LHS
        *       else search RHS
        *
        *   3) if target == middle, answer found
        *
        * Better way to find middle element:
        *   mid = (start + end)/2           // This may exceed int range
        *   mid = start + (end - start)/2   // This will not exceed int range
        *       = (2s+e-s)/2
        *       = (s+e)/2
        *
        * Time Complexity:
        *   Best Case: O(1) //constant
        *   Worst Case: log(N) // N -> array size   //log2(N)
        *
        * Imp = Ignore Constant in space and time complexity
        *
        * */

        int[] AscArr = {1,2,4,6,8,9};
        int target = 2;
        int ans = binarySearchInAscending(AscArr, target);
        System.out.println("ans: " + ans);

        int[] descArr = {9,7,5,4,3,2};
        int targetElement = 2;
        int found = binarySearchInDescending(descArr, targetElement);
        System.out.println("found: " + found);
    }

    static int binarySearchInAscending(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            // find middle element
            int mid = start + (end - start)/2;

            if(target > arr[mid]) {
                start = mid + 1;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int binarySearchInDescending(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            // find middle element
            int mid = start + (end - start)/2;

            if(target > arr[mid]) {
                end = mid - 1;
            }
            else if(target < arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
