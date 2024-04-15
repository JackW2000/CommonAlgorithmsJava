package com.jackw.managers;

import com.jackw.searching.BinarySearch;
import com.jackw.searching.LinearSearch;

// Manager class used to access all searching algorithms from a single entry point
public class SearchingManager {

    public int linearSearch(int[] arr, int searchFor) {
        return LinearSearch.linearSearch(arr, searchFor);
    }

    public int binarySearch(int[] arr, int searchFor) {
        return BinarySearch.binarySearch(arr, searchFor,0, arr.length);
    }
}
