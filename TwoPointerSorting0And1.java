public class TwoPointerSorting0And1 {

    public static void Sort(int[] a,int l , int r)
    {
        while(l<r){
        if(a[l]==1&&a[r]==0)
        {
            swap(a,l,r);
            l++;
            r--;
        }
        if(a[l]==0)
        l++;
        if(a[r]==1)
        r--;
    }
}

    public static void swap(int[] a,int l,int r)
    {
        int temp;
        temp=a[l];
        a[l]=a[r];
        a[r]=temp;
    }
    public static void main(String[] args)
    {
        int []a={0,1,1,0,1,0,0,1,1,0};
        int l=0,r=a.length-1;
        Sort( a,l,r);
        for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
    }
    }
}
