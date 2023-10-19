public class EvenNumberPrinter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        printEvenNumbers(arr);
    }

    public static void printEvenNumbers(int[] arr) {
        System.out.println("Even numbers in the array:");
        for (int number : arr) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
