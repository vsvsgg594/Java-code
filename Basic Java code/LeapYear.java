import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the year : ");
        int year=sc.nextInt();
        if((year%4==0 && year%1000!=0)||year%400==0)
        {
            System.err.println("Leap year");
        }

    }
    
    
}
