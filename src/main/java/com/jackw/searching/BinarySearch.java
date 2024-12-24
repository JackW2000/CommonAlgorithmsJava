package com.jackw.searching;

/** Utility class for performing binary search on an array. */
public class BinarySearch {

  // Private constructor to prevent instantiation
  private BinarySearch() {}

  /**
   * Performs a binary search on the given array. Assumes the input array is already sorted.
   *
   * @param arr the array to search
   * @param searchFor the value to search for
   * @param startIndex the starting index of the array
   * @param endIndex the ending index of the array
   * @return the index of the value if found, otherwise -1
   */
  public static int binarySearch(int[] arr, int searchFor, int startIndex, int endIndex) {

    // Check that there is more than one value in the array (low != high)
    if (endIndex >= startIndex) {
      int mid = startIndex + (endIndex - startIndex) / 2;

      // Check if the value being searched for is found at the midpoint of the input array
      // If it is - return the value of the midpoint as this is the index of the value being
      // searched for
      if (arr[mid] == searchFor) {
        return mid;
      }

      // Verify whether the value being searched for is less than the value at the midpoint of the
      // array
      // If it is - only look at the values in the first half of the array in the next iteration
      // If it is not - the value is either in the second half of the array, or is not present in
      // the array at all
      // By providing index values to this method, we are able to call the method recursively to
      // whittle down the array
      if (arr[mid] > searchFor) {
        return binarySearch(arr, searchFor, startIndex, mid - 1);
      } else {
        return binarySearch(arr, searchFor, mid + 1, endIndex);
      }
    }

    // If the value is not found in the input array, return -1
    return -1;
  }
}
