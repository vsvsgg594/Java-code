import java.util.*;
public class SelectionSort
{
    public static void main(String args[])
    {
        int arr[]={8,5,9,11,6};
        for(int i=0;i<arr.length-1;i++)
        {
            int min_index=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[min_index])
                {
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}