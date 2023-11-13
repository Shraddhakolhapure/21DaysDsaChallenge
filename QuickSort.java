
public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};

        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr, 0,4);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    public static void quickSort(int[] arr, int s,int e) {
        if (s < e) {
        int pivotindex= partition(arr,s,e);
        
        partition(arr,s,pivotindex-1);
        partition(arr,pivotindex+1,e);
        }
    }
    
    public static int partition (int[] arr, int s,int e)
    {
        int pivot=arr[s];
        int i=s;
        for(int j=s+1;j<=e;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
            swap(arr,s,i);
            return i;
        
        
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
