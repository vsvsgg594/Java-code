import java.util.*;
public class Anagram {
    public static boolean isAnagram(String a,String b)
    {
        char arr[]=a.toCharArray();
        char arr1[]=b.toCharArray();
        if(arr.length==arr1.length)
        {
            Arrays.sort(arr);
            Arrays.sort(arr1);
            if(Arrays.equals(arr,arr1))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("aaaabbb", "abababa"));
    }
    
}
