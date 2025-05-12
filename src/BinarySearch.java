public class BinarySearch<T extends Comparable<T>> {

    /**
     * Binary Search is an efficient algorithm for finding an element in a sorted array.
     * It works by repeatedly dividing the array in half and discarding one portion
     * with each iteration.
     * 
     * Complexity:
     * - Best case: O(1) → When the element is in the middle.
     * - Worst case: O(log n) → Since each iteration halves the search space.
     * - Condition: The array must be sorted.
     */

    // Generic method for binary search
    public T search(T[] array, T target) {
        int start = 0;
        int end = array.length - 1;

        // Continue searching while the start index is not greater than the end index
        while (start <= end) {
            // Define the middle index
            int middle = (start - end) / 2; 
            middle = start + (end - start) / 2; // More stable way to calculate the middle

            // Compare the middle element with the target
            /**
             * Possible outcomes:
             * - 0 -> if the middle element is equal to the target
             * - 1 -> if the middle element is greater than the target
             * - -1 -> if the middle element is smaller than the target
             */
            int compare = array[middle].compareTo(target);

            // If the target is found, return the middle element
            if (compare == 0) {
                return array[middle];
            } else if (compare < 0) { // If the middle element is smaller than the target
                start = middle + 1; // Move the start index forward
            } else { // If the middle element is greater than the target
                end = middle - 1; // Move the end index backward
            }
        }

        return null; // Return null if the element is not found
    }

    public int integerSearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2; // Stable way to calculate the middle

            if (array[middle] == target) {
                return middle; // Return the index instead of the target itself
            } else if (array[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1; // Return -1 if the target is not found
    }
}