public class ArrayMiddleToEndPrinter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        printValuesFromMiddleToEnd(arr);
    }

    public static void printValuesFromMiddleToEnd(int[] arr) {
        int middleIndex = arr.length / 2;

        if (middleIndex < arr.length) {
            System.out.println("Values from the middle to the end:");
            for (int i = middleIndex; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("Array is empty or does not have a middle element.");
        }
    }
}
