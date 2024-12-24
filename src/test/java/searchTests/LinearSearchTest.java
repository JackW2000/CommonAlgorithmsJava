package searchTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.jackw.managers.SearchingManager;
import org.junit.jupiter.api.Test;

class LinearSearchTest {

  SearchingManager searchingManager = new SearchingManager();

  int[] unsortedArr = {10, 5, 60, 54, 1, 57, 19, 954, 15, 30};

  @Test
  void whenSearchForValueInList_thenSearchIndexCorrectlyReturned() {
    int searchIndex = searchingManager.linearSearch(unsortedArr, 54);
    assertEquals(3, searchIndex);
  }

  @Test
  void whenSearchForValueNotInList_thenSearchReturnsNegativeOne() {
    int searchIndex = searchingManager.linearSearch(unsortedArr, 123);
    assertEquals(-1, searchIndex);
  }
}
