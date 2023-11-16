public class ComparisionString {
    public static void main(String[] args) {
        //We can compare String in Java on the basis of content and reference.

        // There are three method to compare string in java
        //1.equal method=>which compare original content of string it provide two
        //public boolean equals(Object another) compares this string to the specified object.
       //public boolean equalsIgnoreCase(String another) compares this string to another string, ignoring case.
    //    String str="vikash";
    //    String str2="VIKASH";
    //    String str3=new String("vikash");
    //    String str4="Reenu";
    //    System.out.println(str.equals(str2));//false
    //    System.out.println(str2.equals(str3));//false
    //    System.out.println(str3.equals(str4));//false
    //    System.out.println(str.equals(str3));//true
    //    System.out.println(str.equalsIgnoreCase(str2));//true

       // 2.==method compare refernce of the string
    //    String s1="vikash";
    //    String s2=new String("vikash");
    //    System.out.println(s1==s2);//false
    //    String s3="Reenu";
    //    System.out.println(s1==s3);//false
    //3. compareTo()=>comapre  lexicographically and returns an integer value that describes 
        //if first string is less than, equal to or greater than second string.
        String s1="vikash";
        String s2="vikash reenu";
        System.out.println(s1.compareTo(s2));





    }
}
