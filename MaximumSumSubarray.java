import java.util.*;
class MaximumSumSubarray {
    public static void main(String[] args)
    {
        Scanner d=new Scanner(System.in);
        int n=d.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=d.nextInt();
        }
        MaximumSumSubarray s=new MaximumSumSubarray();
        int a=s.maxSubArray(nums);
        System.out.println(a);
        d.close();
    }
    public int maxSubArray(int[] nums) {
       int n=nums.length;
       int max=Integer.MIN_VALUE,sum=0;
       for(int i=0;i<n;i++)
       {
           sum+=nums[i];
           max=Math.max(sum,max);
           if(sum<0)
           {
               sum=0;
           }
       }
       return max;
}
}