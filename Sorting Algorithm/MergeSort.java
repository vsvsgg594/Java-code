import java.util.*;
public class MergeSort {

    public static void divide(int arr[],int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int mid=start+(end-start)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conqure(arr,start,mid,end);
    }
    public static void conqure(int arr[],int start,int mid,int end)
    {
        int indx1=start;
        int index2=mid+1;
        int x=0;
        int merge[]=new int[end-start+1];
        while(indx1<=mid && index2<=end)
        {
            if(arr[indx1]<=arr[index2])
            {
                merge[x++]=arr[indx1++];
            }
            else
            {
                merge[x++]=arr[index2++];
            }
        }
        while(indx1<=mid)
        {
              merge[x++]=arr[indx1++];
        }
        while (index2<=end) 
        {
             merge[x++]=arr[index2++];
        }
        for(int i=0,j=start;i<merge.length;i++,j++)
        {
            arr[j]=merge[i];
        }
    }
    public static void main(String[] args) 
    {
        int arr[]={9,6,11,5};
        int start=0;
        int end=arr.length;
        divide(arr, start, end-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
