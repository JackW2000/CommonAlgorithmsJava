package com.jackw.searching;

/** Utility class for performing linear search on an array. */
public class LinearSearch {

  // Private constructor to prevent instantiation
  private LinearSearch() {}

  /**
   * Performs a linear search on the given array.
   *
   * @param arr the array to search
   * @param searchFor the value to search for
   * @return the index of the value if found, otherwise -1
   */
  public static int linearSearch(int[] arr, int searchFor) {

    // Iterate over array in order until fully traversed
    for (int i = 0; i < arr.length; i++) {

      // Verify whether the value being searched for is held at the current index location
      // If it is - return the index as the value is now found
      // If it is not - continue to the next iteration and perform the check again
      if (arr[i] == searchFor) {
        return i;
      }
    }

    // If the value is not found in the input array then return -1
    return -1;
  }
}
