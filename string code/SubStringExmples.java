import java.util.Arrays;

public class SubStringExmples {
    public static void main(String[] args) {
        // subString is part of string//
        //You can get substring from the given String object by one of the two methods:

// public String substring(int startIndex):
// This method returns new String object containing the substring
//  of the given string from specified startIndex (inclusive).
//   The method throws an IndexOutOfBoundException when 
//   the startIndex is larger than the length of String or less than zero.
// public String substring(int startIndex, int endIndex):
// This method returns new String object containing the substring of
//  the given string from specified startIndex to endIndex.
//  The method throws an IndexOutOfBoundException
//   when the startIndex is less than zero or startIndex is greater than endIndex
//  or endIndex is greater than length of String.
    //   String str="vikash";
    //   System.out.println(str.substring(2));
    //   System.out.println(str.substring(0,6));

      // Split() method used to extract substring from sentance//
        String text= new String("Hello, My name is Sachin");  
        String[] sentences = text.split("\\.");  
        System.out.println(Arrays.toString(sentences));  
      
    }
    
}
