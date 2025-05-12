public class App {
    public static void main(String[] args) {

        testBinarySearch();

    }
    public static void testLinearSearch() {
        
        Integer[] array = {3, 4, 6, 1, 32, 12, 5, 7, 9, 19};

        LinearSearch<Integer> search = new LinearSearch<>();

        int result = search.search(array, 7);

        if (result == -1) {
            System.out.println("The element was not found");
        } else {
            System.out.println("Element found: " + result);
        }
    }

    public static void testBinarySearch() {
        
        Double[] array = {0.2, 0.3, 0.5, 0.9, 1.0, 1.4, 2.5, 5.0};

        BinarySearch<Double> search = new BinarySearch<>();

        Double result = search.search(array, 2.5);

        if (result == null) {
            System.out.println("The element was not found");
        } else {
            System.out.println("Index of the element found: " + result);
        }
    }
}
