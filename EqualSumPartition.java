public class EqualSumPartition {
    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        boolean canPartition = canPartition(nums);

        if (canPartition) {
            System.out.println("The array can be partitioned into two equal-sum subsets.");
        } else {
            System.out.println("The array cannot be partitioned into two equal-sum subsets.");
        }
    }

    public static boolean canPartition(int[] nums) {
        int totalSum = findArraySum(nums);
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int suffixSum = totalSum - prefixSum;

            if (prefixSum == suffixSum) {
                return true;
            }
        }

        return false;
    }

    public static int findArraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
