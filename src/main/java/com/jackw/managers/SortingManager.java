package com.jackw.managers;

import com.jackw.sorting.*;

// Manager class used to access all sorting algorithms from a single entry point
public class SortingManager {

    public int[] bubbleSort(int[] arr) {
        return BubbleSort.bubbleSort(arr);
    }

    public int[] insertionSort(int[] arr) {
        return InsertionSort.insertionSort(arr);
    }

    public int[] mergeSort(int[] arr) {
        return MergeSort.mergeSort(arr);
    }

    public int[] quickSort(int[] arr) {
        return QuickSort.quickSort(arr, 0, arr.length-1);
    }

    public int[] selectionSort(int[] arr) {
        return SelectionSort.selectionSort(arr);
    }
}
