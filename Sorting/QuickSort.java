import java.util.*;
public class QuickSort {
   public int partiotion(int arr[],int start,int end)
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
    int temp=arr[pindex];
    arr[pindex]=arr[end];
    arr[end]=temp;
    return pindex;
   }
   public void quick(int arr[],int start,int end)
   {
    if(start<end)
    {
        int p=partiotion(arr, start, end);
        quick(arr, start, p-1);
        quick(arr, p+1, end);

    }
   }


    public static void main(String[] args) {
        QuickSort q1=new QuickSort();
        int arr[]={1,10,2,9,3,8,4,7};
        q1.quick(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
    
}
// Best time complexity  :  (nlog(n))
//Average time complexity :0(Nlog(N))
//worst time complexity :O(N2)