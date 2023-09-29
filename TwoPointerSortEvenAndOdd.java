public class TwoPointerSortEvenAndOdd {


    public static void swap(int[]a,int l,int r)
    {
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
    }
    public static void sort(int[]a,int l,int r)
    {
        while(l<r)
        {
            if(a[l]%2!=0&&a[r]%2!=1)
            {
                swap(a,l,r);
                l++;
                r--;
            }
            if(a[l]%2==0)
            {
                l++;
            }
           if(a[r]%2==1)
           {
            r--;
           }
        }
    }
    public static void main(String[] args)
    {
        int []a={1,4,6,2,3,8,9,11,0,7};
        int n=a.length;
        int l=0,r=n-1;
        sort(a,l,r);
        System.out.println("the Sorted list is..");
        for(int i=0;i<n;i++)
        {
           System.out.print(a[i]+" ");
        }
    }
}
