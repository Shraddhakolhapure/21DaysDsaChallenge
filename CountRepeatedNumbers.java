import java.util.*;
public class CountRepeatedNumbers {
    public static void main(String[] args)
    {
         Scanner l=new Scanner(System.in);
         System.out.println("Enter Array size");
         int n=l.nextInt();
         int[]a=new int[n];
         System.out.println("Enter Array element");
         for(int i=0;i<n;i++)
         {
            a[i]=l.nextInt();
         }
        System.out.println("number of repeted elements are "+(repetedno(a,n)));
        l.close();
    } 
    public static int repetedno(int[]a,int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                 count++;
                }
            }
        }
        return (count==0)?-1:count;
    }
}
