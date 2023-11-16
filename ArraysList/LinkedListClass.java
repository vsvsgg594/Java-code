import java.util.*;
import java.util.LinkedList;
public class LinkedListClass
{
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);
        list.addFirst(7);
        list.addLast(8);
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println(list.pop());
        System.out.println(list);
    }
}