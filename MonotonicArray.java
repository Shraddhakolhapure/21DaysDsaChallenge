import java.util.Scanner;

public class MonotonicArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        boolean p = isMonotonic(a);
        System.out.println("Is the array monotonic? " + p);
        s.close();
    }

    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                increasing = false;
            }
            if (nums[i - 1] < nums[i]) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }
}
