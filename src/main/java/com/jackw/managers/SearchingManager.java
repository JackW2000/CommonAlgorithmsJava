package com.jackw.managers;

import com.jackw.searching.BinarySearch;
import com.jackw.searching.LinearSearch;

/** Manager class used to access all searching algorithms from a single entry point. */
public class SearchingManager {

  /**
   * Performs a linear search on the given array.
   *
   * @param arr the array to search
   * @param searchFor the value to search for
   * @return the index of the value if found, otherwise -1
   */
  public int linearSearch(int[] arr, int searchFor) {
    return LinearSearch.linearSearch(arr, searchFor);
  }

  /**
   * Performs a binary search on the given array.
   *
   * @param arr the array to search
   * @param searchFor the value to search for
   * @return the index of the value if found, otherwise -1
   */
  public int binarySearch(int[] arr, int searchFor) {
    return BinarySearch.binarySearch(arr, searchFor, 0, arr.length);
  }
}
