public class SuffixSum {
    public static void main(String[] args)
    {
        int[]a={1,2,3,4,5};
        System.out.println("suffix sum is");
        checkSuffix(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void checkSuffix(int[]a)
    {
        for(int i=a.length-1;i>0;i--)
        {
            a[i]=a[i]+a[i-1];
            // System.out.println(a[i]+" ");
        }
    }
}
