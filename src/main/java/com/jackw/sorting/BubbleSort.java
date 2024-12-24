package com.jackw.sorting;

/** Utility class for performing bubble sort on an array. */
public class BubbleSort {

  // Private constructor to prevent instantiation
  private BubbleSort() {}

  /**
   * Performs a bubble sort on the given array. Works from left to right and moves the largest value
   * to its correct location in each iteration.
   *
   * <p>Time Complexity: Best - O(n), Average - O(n^2), Worst - O(n^2)
   *
   * @param arr the array to sort
   * @return the sorted array
   */
  public static int[] bubbleSort(int[] arr) {

    // Loop through the array until the array length is met
    for (int i = 0; i < arr.length - 1; i++) {

      // Loop through the array - iteration from prior loop as outer-most value will be sorted
      // already - 1 (index from 0)
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
