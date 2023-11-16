public class ConcatationString {
    public static void main(String[] args) {
    // concatation is forms new string or add string in exiting string//
      // There are two ways to concate the string in java 1.+ 2.concate()
      //1.+
      String s1="vikash";
      String s2="Reenu";
      System.out.println(s1+" "+s2);
      String str=s1+s2;
      System.out.println(str);
      //2.concate()
      System.out.println(s1.concat("REENU"));
    }
    
}
