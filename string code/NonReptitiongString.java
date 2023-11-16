import java.util.*;
public class NonReptitiongString {
   
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        Map<Character,Integer> map=new HashMap();
        for(int i=0;i<S.length();i++)
        {
            if(map.containsKey(S.charAt(i)))
            {
                map.put(S.charAt(i),map.get(S.charAt(i))+1);
            }
            else
            {
                map.put(S.charAt(i),1);
            }
        }
        for(int i=0;i<S.length();i++)
        {
            if(map.get(S.charAt(i))==1)
            {
                return S.charAt(i);
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        NonReptitiongString n=new NonReptitiongString();
        String str="helloo";
        System.out.println(nonrepeatingCharacter(str));

        
    }
    
}
