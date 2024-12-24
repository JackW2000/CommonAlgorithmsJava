package searchTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.jackw.managers.SearchingManager;
import com.jackw.sorting.MergeSort;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

  SearchingManager searchingManager = new SearchingManager();

  int[] unsortedArr = {10, 5, 60, 54, 1, 57, 19, 954, 15, 30};

  @Test
  void whenSearchForValueInList_thenSearchIndexCorrectlyReturned() {
    MergeSort.mergeSort(unsortedArr);

    int searchIndex = searchingManager.binarySearch(unsortedArr, 54);
    assertEquals(6, searchIndex);
  }

  @Test
  void whenSearchForValueNotInList_thenSearchReturnsNegativeOne() {
    MergeSort.mergeSort(unsortedArr);

    int searchIndex = searchingManager.binarySearch(unsortedArr, 123);
    assertEquals(-1, searchIndex);
  }
}
