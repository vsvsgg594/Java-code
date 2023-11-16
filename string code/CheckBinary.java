//Given a non-empty sequence of characters str, return true if sequence is Binary, else return false
public class CheckBinary
{
    boolean isBinary(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!='1' && str.charAt(i)!='0')
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="101";
        CheckBinary c1=new CheckBinary();
        Boolean t=c1.isBinary(str);
        System.out.println(t);
    }
}
