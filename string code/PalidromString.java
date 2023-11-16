import java.util.*;
public class PalidromString {
    int isPalindrome(String S) {
        // code here
        String str="";
        for(int i=S.length()-1;i>=0;i--)
        {
            str=str+S.charAt(i);
        }
        if(S.equals(str))
        return 1;
        else
        return 0;


    }
    public static void main(String[] args) {
        
        PalidromString p=new PalidromString();
        String str="abba";

        int i=p.isPalindrome(str);
        System.out.println(i);
    }
    
}
