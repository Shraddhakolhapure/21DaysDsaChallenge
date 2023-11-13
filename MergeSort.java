public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Original Array:");
        printArray(arr);

        mergeSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; 
        }

        int middle = arr.length / 2;
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }
        for (int i = middle; i < arr.length; i++) {
            right[i - middle] = arr[i];
        }

        
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted subarrays
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge elements from left and right subarrays into the main array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements from left subarray, if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements from right subarray, if any
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
