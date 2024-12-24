package com.jackw.sorting;

import java.util.Arrays;

/** Utility class for performing merge sort on an array. */
public class MergeSort {

  // Private constructor to prevent instantiation
  private MergeSort() {}

  /**
   * Performs a merge sort on the given array. Recursively divides the array, compares subarrays,
   * and rebuilds a sorted array from divided subarrays.
   *
   * <p>Time Complexity: Best - O(n log(n)), Average - O(n log(n)), Worst - O(n log(n))
   *
   * @param arr the array to sort
   * @return the sorted array
   */
  public static int[] mergeSort(int[] arr) {

    // Can't perform merge sort if input array length is less than 2
    if (arr.length < 2) {
      return arr;
    }

    // Calculate the midpoint of the array
    int mid = arr.length / 2;

    // Create 2 sub arrays, one for the left half and another for the right
    int[] leftSplit = Arrays.copyOfRange(arr, 0, mid);
    int[] rightSplit = Arrays.copyOfRange(arr, mid, arr.length);

    // Recursively calling the function to divide the subarrays further
    mergeSort(leftSplit);
    mergeSort(rightSplit);

    // Calling the merge method to recombine splits in a sorted order
    merge(leftSplit, rightSplit, arr);

    return arr;
  }

  /**
   * Merges two subarrays into a single sorted array.
   *
   * @param leftSplit the left subarray
   * @param rightSplit the right subarray
   * @param arr the array to store the merged result
   */
  public static void merge(int[] leftSplit, int[] rightSplit, int[] arr) {
    int mainIterator = 0;
    int leftIterator = 0;
    int rightIterator = 0;

    // While the iterators are not at the end of each half
    while (leftIterator < leftSplit.length && rightIterator < rightSplit.length) {

      // Compare the values of each half at the index point
      if (leftSplit[leftIterator] < rightSplit[rightIterator]) {

        // If the value in the left split is less than that of the right split
        // - Set the current index value for the main array to hold the value of the left split
        arr[mainIterator] = leftSplit[leftIterator];

        // Increment through the left split
        leftIterator++;
      } else {
        // If the value in the right split is less than that of the left split
        // - Set the current index value for the main array to hold the value of the right split
        arr[mainIterator] = rightSplit[rightIterator];

        // Increment through the right split
        rightIterator++;
      }

      // Increment to the next position in the main array
      mainIterator++;
    }

    // Whilst there are still values to iterate over in the left half
    while (leftIterator < leftSplit.length) {
      // Set the value at the main array index to that of the left split
      arr[mainIterator] = leftSplit[leftIterator];

      // Increment the left and main array index values
      leftIterator++;
      mainIterator++;
    }

    // Whilst there are still values to iterate over in the right half
    while (rightIterator < rightSplit.length) {
      // Set the value at the main array index to that of the right split
      arr[mainIterator] = rightSplit[rightIterator];

      // Increment the right and main array index values
      rightIterator++;
      mainIterator++;
    }
  }
}
