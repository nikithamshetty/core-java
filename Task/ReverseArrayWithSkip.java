public class ReverseArrayWithSkip {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        printReversedArrayWithSkip(arr);
    }

    public static void printReversedArrayWithSkip(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array has less than 2 elements. Cannot skip any values.");
            return;
        }

        System.out.println("Reversed array with one value skipped:");
        for (int i = arr.length - 1; i >= 0; i -= 2) {
            System.out.println(arr[i]);
        }
    }
}
