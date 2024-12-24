package com.jackw.sorting;

/**
 * The SelectionSort class provides a static method to perform selection sort on an array of
 * integers.
 */
public class SelectionSort {

  private SelectionSort() {}

  /**
   * Sorts the given array using the selection sort algorithm.
   *
   * <p>Selection sort: - Divides an array into 2 portions - The left division being treated as
   * sorted - The right division being treated as unsorted - Moves the smallest item in each
   * iteration into its position in the sorted half
   *
   * <p>Time Complexity: Best - O(n^2) Average - O(n^2) Worst - O(n^2)
   *
   * @param arr the array to be sorted
   * @return the sorted array
   */
  public static int[] selectionSort(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      // Assume index i to be the smallest for the first pass
      // The loop will increment so all values below i should be sorted correctly
      int minVal = i;

      // Loop for i+1 as value at index i is being used for comparison and swap
      for (int j = i + 1; j < arr.length; j++) {

        // If the value at index j is less, update the index for minVal
        if (arr[j] < arr[minVal]) {
          minVal = j;
        }
      }

      // Once the j loop terminates, min_val will hold the position of the smallest value
      // Using this index, swap the values of index i and minVal
      int temp = arr[i];
      arr[i] = arr[minVal];
      arr[minVal] = temp;
    }
    return arr;
  }
}
