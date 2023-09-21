import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArray(a, k);

        System.out.println("Rotated array: " + Arrays.toString(a));
    }

    public static void rotateArray(int[] a, int k) {
        int n = a.length;
        k = k % n; // Ensure k is within the range [0, n)

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < k) {
                ans[i] = a[n - k + i];
            } else {
                ans[i] = a[i - k];
            }
        }

        System.arraycopy(ans, 0, a, 0, n);
    }
}
