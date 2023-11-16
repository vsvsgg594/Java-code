import java.util.*;
public class MiminumNumber {
    public static void main(String[] args) {
        int arr[] ={90,123,45,80,0};
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    
}
