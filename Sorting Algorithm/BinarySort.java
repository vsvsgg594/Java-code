import java.util.*;
public class BinarySort {

    public static int binarySort(int arr[],int start,int item,int end)
    {
        while (start<=end) 
        {
            int mid=start+(end-start)/2;
            if(item==arr[mid])
            {
                return mid+1;

            }
            else if (item>arr[mid]) 
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }

            
        }
        return start;
    }
    public static void main(String[] args) {
        int arr[]={9,6,11,5};
        int r=binarySort(arr, 0, 6,arr.length-1);
        System.out.println(r);
        }
    
}
