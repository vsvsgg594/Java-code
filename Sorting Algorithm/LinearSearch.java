import java.util.*;
public class LinearSearch 
{
    public static void main(String args[])
    {
        int arr[]={9,88,12,345};
        int key=9;
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
    
}
