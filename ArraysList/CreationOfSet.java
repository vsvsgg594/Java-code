import java.util.*;
public class CreationOfSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(5);
        set.add(5);
        set.add(1);
        Iterator<Integer> itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        //remove data from set//
        set.remove(0);
        System.out.println(set);
        set.add(null);
        System.out.println(set);

        
    }

    
}
