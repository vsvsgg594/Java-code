import java.util.*;
public class Fabonnaci {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of series :");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        while(n>0)
        {
            if(a==0 && b==1)
            {
                System.out.println(a);
                System.out.println(b);
            }
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            n--;

        }
    }
    
}
