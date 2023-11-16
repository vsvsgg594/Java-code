import java.util.*;
public class MergeSort {
    public static void divie(int arr[],int start,int end)
    {
        if(start>=end)
        {
            int mid=start+(end-start)/2;
            divie(arr, start, mid-1);
            divie(arr, mid+1, end);
            conquere(arr,start,mid,end);
        }
    }
    public static void conquere(int arr[],int start,int mid,int end)
    {
        int merge[]=new int[end-start];
        int index1=start;
        int index2=mid+1;
        int x=0;
        while(index1<=mid && index2<=end)
        {
            if(arr[index1]<=arr[index2])
            {
                merge[x++]=arr[index1++];
            }
            else
            {
                merge[x++]=arr[index2++];
            }
        }
        while(index1<=mid)
        {
            merge[x++]=arr[index1++];
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
    public static void main(String[] args) {
        int arr[]={1,10,101,2,7,2,4,99};
    MergeSort.divie(arr, 0, arr.length);
    for(int i=1;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
    }
    
}
//time complexity :0(nlog(n))
//space complexity :0(n)
