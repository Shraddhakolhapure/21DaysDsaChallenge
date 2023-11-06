import java.util.Scanner;

public class CheckSortedRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isSorted = isSorted(arr, 0);

        if (isSorted) {
            System.out.println("The array is sorted in strictly increasing order.");
        } else {
            System.out.println("The array is not sorted in strictly increasing order.");
        }

        scanner.close();
    }

    public static boolean isSorted(int[] arr, int index) {
        if (index >= arr.length - 1) {
            // If we reach the last element or beyond, the array is sorted.
            return true;
        }

        if (arr[index] >= arr[index + 1]) {
            // If the current element is greater than or equal to the next element, it's not sorted.
            return false;
        }

        // Recursively check the next element.
        return isSorted(arr, index + 1);
    }
}
