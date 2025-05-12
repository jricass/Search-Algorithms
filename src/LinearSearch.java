public class LinearSearch<T> {

  /*
   * Linear search is the simplest searching algorithm, it is used to find a
   * specific
   * element in an array or list. It works by sequentially checking each element
   * in an
   * array or list. Checking one by one. . .
   * 
   * Complexity:
   * Worts case: O(n) -> iterate through all the array
   * Bast case: O(1) -> element in first position
   * Medium case: O(n/2) -> stills O(n). . .
   */

  // This is a generic method for linear search
  public int search(T[] array, T target) { // The parameters are both the array and the value that we want to find.

    // First, we will iterate through the array
    for (int i = 0; i < array.length; i++) {
      // If the current element matches('equals') the target in the parameter
      if (target != null && array[i].equals(target)) {
        // We return the index
        return i;
      }
    }

    // Otherwise, we return -1
    return -1;
  }

  public int integerSearch(int[] array, int target) {

    for (int i = 0; i < array.length; i++) {
      if (array[i] == target) {
        return i;
      }
    }

    return -1;
  }

  public int stringSearch(String[] array, String target) {

    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(target)) {
        return i;
      }
    }

    return -1;
  }
}
