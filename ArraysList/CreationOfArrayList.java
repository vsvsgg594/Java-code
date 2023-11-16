import java.util.*;
public class CreationOfArrayList
{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        // System.out.println(list);
        list.add(2,2);
        // System.out.println(list);
        System.out.println(list.get(1));
        if(!list.isEmpty())
        {
            list.add(10);
        }
        System.out.println(list);

        //sort the ArraysList//
        Collections.sort(list);
        System.out.println(list);
        
    }
}