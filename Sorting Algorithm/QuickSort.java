import java.util.*;
public class QuickSort
{
    public int partition(int arr[],int start,int end)
    {
        int pivot=arr[end];
        int pindex=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[i]<pivot)
            {
                int temp=arr[pindex];
                arr[pindex]=arr[i];
                arr[i]=temp;
                pindex++;
            }
           
        }
        int temp= arr[pindex];
        arr[pindex]=arr[end];
        arr[end]=temp;
        // pindex++;
        return pindex;
    }
    public void quick(int arr[],int start,int end)
    {
        if(start<=end)
        {
            int p=partition(arr, start, end);
            quick(arr, start, p-1);
            quick(arr, p+1, end);
        }
    }
    public static void main(String args[])
    {
        QuickSort q1=new QuickSort();
        int arr[]={9,6,11,5};
        q1.quick(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}