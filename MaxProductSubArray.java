import java.util.Scanner;

public class MaxProductSubArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i;
        n = s.nextInt();
        int[] nums = new int[n];
        for (i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        MaxProductSubArray a = new MaxProductSubArray();
        int b = a.maxProduct(nums);
        System.out.println(b);
        s.close();
    }

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        long max = nums[0]; // Initialize max with the first element
        long min = nums[0]; // Initialize min with the first element
        long result = nums[0]; // Initialize result with the first element

        for (int i = 1; i < nums.length; i++) {
            // Swap max and min if the current number is negative
            if (nums[i] < 0) {
                long temp = max;
                max = min;
                min = temp;
            }

            // Update max and min for the current element
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            // Update the result with the maximum product found so far
            result = Math.max(result, max);
        }

        return (int) result;
    }
}
