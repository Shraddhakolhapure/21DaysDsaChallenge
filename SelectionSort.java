public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {1, 5, 2, 9, 0};
        int n = a.length;
        bubblesort(a, n);
        System.out.println("Sorted list is...");
        printlist(a);
    }

    public static void bubblesort(int[] a, int n) {
        for (int i = 0; i < n ; i++) {
            int min=i;
            for (int j = i+1; j < n; j++) {
                if (a[j] <a[min]) {
                    min=j;
                    swaping(a, j, i);
                    
                }
            }
        }
    }

    public static void swaping(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void printlist(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
