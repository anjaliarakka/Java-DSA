package com.anjali.Algorithms.Searching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        /*
        *
        * When sorting order is not known of an array whether ascending/descending order = Order-Agnostic Binary Search
        *
        * Determine order of sorted array:
        *
        * if start element > end element -> Descending order
        *
        * if start element < end element -> Ascending order
        * */

        int[] arr = {80,76,71,68,64,61,57,56,52};
        int target = 56;
        int ans = orderAgnosticBS(arr, target);
        System.out.println("ans: " + ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        // find array sorting type
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start)/2;

            // first write common scenario
            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {

                if (target > arr[mid]){
                    start = mid + 1;
                }
                else end = mid - 1;
            }
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                }
                else end = mid - 1;
            }
        }
        return -1;
    }
}
