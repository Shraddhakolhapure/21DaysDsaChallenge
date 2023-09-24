import java.util.*;
public class SortedSquares {
    public static void main(String[] args){
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int[]a=new int[n];
        int i;
        for( i=0;i<n;i++)
        {
            a[i]=z.nextInt();
        }
        int[] sol=sortsquare(a);
        for(i=0;i<n;i++)
        {
            System.out.print(sol[i]+" ");
        }

    }
    public static int[] sortsquare(int[] a)
    {
        int n=a.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=a[i]*a[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
