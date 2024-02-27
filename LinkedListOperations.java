import java.util.*;
public class Main
{
public static void main(String[] args) {
System.out.println("Hello World");
LinkedList<Integer> list=new LinkedList<>();
LinkedList<Integer> list1=new LinkedList<>();
list.add(10);
list.add(20);
list.add(30);
list1.add(100);
list1.add(200);
list1.add(300);
list.add(40);
list.add(50);
System.out.println(list);
list.add(2,30);
System.out.println(list);
System.out.println(list1);
list.addAll(list1);
System.out.println(list);
list.addFirst(9);
list.addLast(400);
System.out.println(list);
list.remove(2);
   System.out.println(list.getFirst());
   System.out.println(list.getLast());
   list.removeAll(list1);
   System.out.println(list);
   list.clear();
   System.out.println(list);

}
}
