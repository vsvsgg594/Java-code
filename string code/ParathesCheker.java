import java.util.*;
public class ParathesCheker {
    public boolean ispar(String x)
    {
        Stack<Character> st=new Stack();
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='('||x.charAt(i)=='{'||x.charAt(i)=='[')
            {
                st.push(x.charAt(i));
            }
            else if(!st.isEmpty() && ((x.charAt(i)==')'&& st.peek()=='(')||
                                     (x.charAt(i)==']'&& st.peek()=='[') ||
                                     (x.charAt(i)=='}'&& st.peek()=='{')))
                                     {
                                        st.pop();
                                     }
                                     else
                                     {
                                        st.push(x.charAt(i));
                                     }

                        

        }
        if(st.isEmpty())
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        String str="[({})]";
        ParathesCheker c1=new ParathesCheker();
        boolean b1=c1.ispar(str);
        System.out.println(b1);

    }
    
}
