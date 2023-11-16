import java.util.*;
public class CreationString
{
    public static void main(String args[])
    {
        // String in java is basically objects that represent sequence of char values//
        //there are two ways to create string in java 
        // 1.by literal
        String str="vikash";
        System.out.println(str);
        //The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.
        // The CharSequence interface is used to represent the sequence of characters. String, 
        //StringBuffer and StringBuilder classes implement it.
        // It means, we can create strings in Java by using these three classes.
        char ch[]={'s','t','r','i','n','g','s'}; 
        String s2=new String(ch);
        System.out.println(s2);
        String str2=new String("vikash sharma");
        System.out.println(str2);
    }
}