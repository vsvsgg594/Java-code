public class MethodesOfString {
    
    public static void main(String[] args) {
        // java.lang.String provides many built in method for stri g 
        //1 .toUpperCase() 
        // String str="vikash";
        // System.out.println(str.toUpperCase());

        // //2.toLOwerCase()
        // String str1="VIKASH";
        // System.out.println(str1.toLowerCase());


        //3.trim() method eliminate white space before and after
        // String str2=" vikash ";
        // System.out.println(str2);
        // System.out.println(str2.length());
        // String str3=str2.trim();
        // System.out.println(str3.length());

        //4.startsWith() and endsWith()
        // String str="vikash";
        // System.out.println(str.startsWith("v"));
        // System.out.println(str.endsWith("h"));

        //5.charAt() =>The String class charAt() method returns a character at specified index
        String str="vikash";
        System.out.println(str.charAt(0));
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='v')
            {
               System.out.println(i);
            }
        }
        //ValueOf()=> convert given datatype such as int ,long,float,double,boolean,char
        int a=10;
        String str1=String.valueOf(a);
        System.out.println(str1+"10");

    }
}
