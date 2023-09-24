
class RotateArray{
    public static void main(String[] args)
    {
        int []a={1,2,3,4,5,6};
        int k=4,i;
        int n=a.length;
        reverse(a,0,n-1);
        reverse(a,0,k-1);
        reverse(a,k,n-1);
        System.out.println("Sorted array is");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        
        
    }
    public static void reverse(int[]a,int s,int e)
    {
        while(s<e){
        int temp=a[s];
        a[s]=a[e];
        a[e]=temp;
        s++;
        e--;
    }
}
}
