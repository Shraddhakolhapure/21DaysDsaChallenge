public class MajorityElementSolution {

    public static void main(String[] args) {
        MajorityElementSolution solution = new MajorityElementSolution();
        int[] nums = {3, 2, 3};
        int majority = solution.majorityElement(nums);
        System.out.println("Majority element: " + majority);
    }

    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majorityElement) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                majorityElement = nums[i];
                count = 1;
            }
        }

        return majorityElement;
    }
}
