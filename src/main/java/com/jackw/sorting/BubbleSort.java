package com.jackw.sorting;

public class BubbleSort {

    private BubbleSort() {}

    // Bubble sort:
    // - Works from left to right
    // - Moves the largest value to its correct location in each iteration
    // Time Complexity: Best - O(n) Average - O(n^2) Worst - O(n^2)

    // Declare method to perform the sort, taking an array as param
    public static int[] bubbleSort(int[] arr) {

        // Loop through the array until the array length is met
        for (int i = 0; i < arr.length - 1; i++) {

            // Loop through the array - iteration from prior loop as outer-most value will be sorted already - 1 (index from 0)
            for (int j = 0; j < arr.length - i - 1; j++) {

                // Compare value to the following position and swap if following value is smaller
                if (arr[j] > arr[j + 1]) {

                    // Use arithmetic to swap values without needing a temp variable
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        return arr;
    }
}
