package com.jackw.managers;

import com.jackw.sorting.BubbleSort;
import com.jackw.sorting.InsertionSort;
import com.jackw.sorting.MergeSort;
import com.jackw.sorting.QuickSort;
import com.jackw.sorting.SelectionSort;

/** Manager class used to access all sorting algorithms from a single entry point. */
public class SortingManager {

  /**
   * Performs a bubble sort on the given array.
   *
   * @param arr the array to sort
   * @return the sorted array
   */
  public int[] bubbleSort(int[] arr) {
    return BubbleSort.bubbleSort(arr);
  }

  /**
   * Performs an insertion sort on the given array.
   *
   * @param arr the array to sort
   * @return the sorted array
   */
  public int[] insertionSort(int[] arr) {
    return InsertionSort.insertionSort(arr);
  }

  /**
   * Performs a merge sort on the given array.
   *
   * @param arr the array to sort
   * @return the sorted array
   */
  public int[] mergeSort(int[] arr) {
    return MergeSort.mergeSort(arr);
  }

  /**
   * Performs a quick sort on the given array.
   *
   * @param arr the array to sort
   * @return the sorted array
   */
  public int[] quickSort(int[] arr) {
    return QuickSort.quickSort(arr, 0, arr.length - 1);
  }

  /**
   * Performs a selection sort on the given array.
   *
   * @param arr the array to sort
   * @return the sorted array
   */
  public int[] selectionSort(int[] arr) {
    return SelectionSort.selectionSort(arr);
  }
}
