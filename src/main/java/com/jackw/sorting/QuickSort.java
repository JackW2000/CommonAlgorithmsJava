package com.jackw.sorting;

/** The QuickSort class provides a static method to perform quick sort on an array of integers. */
public class QuickSort {

  private QuickSort() {}

  /**
   * Sorts the given array using the quick sort algorithm. Quick sort: - Selects an index (pivot)
   * and sorts around it - Treats values to the left of the pivot as being lesser - Treats values to
   * the right of the pivot as being greater - Performed recursively on either side of the pivot
   * Time Complexity: Best - O(n log n) Average - O(n log n) Worst - O(n^2)
   *
   * @param arr the array to be sorted
   * @param firstIndex the starting index of the array to be sorted
   * @param lastIndex the ending index of the array to be sorted
   * @return the sorted array
   */
  public static int[] quickSort(int[] arr, int firstIndex, int lastIndex) {

    if (firstIndex < lastIndex) {
      int pivot = firstIndex;
      int i = firstIndex;
      int j = lastIndex;

      while (i < j) {
        while (arr[i] <= arr[pivot] && i < lastIndex) {
          i++;
        }
        while (arr[j] > arr[pivot]) {
          j--;
        }
        if (i < j) {
          arr[i] = arr[i] + arr[j];
          arr[j] = arr[i] - arr[j];
          arr[i] = arr[i] - arr[j];
        }
      }

      int temp = arr[pivot];
      arr[pivot] = arr[j];
      arr[j] = temp;

      quickSort(arr, firstIndex, j - 1);
      quickSort(arr, j + 1, lastIndex);
    }

    return arr;
  }
}
