import java.util.*;
public class KthSortedElement {
    public static void main(String[] args)
    {
        int a[]={2,7,-3,5,1,8,6,-6};
        int k=5;
        Arrays.sort(a);
        System.out.println(a[k-1]);
    }
}
