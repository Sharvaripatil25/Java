//List-LinkedList
//additional methods-addFirst,addLast,removeFirst,removeLast
//grtFirst,getLast
import java.util.LinkedList;
import java.util.Collections;


public class collection2 {
    public static void main(String[] args) {
        LinkedList<String> name=new LinkedList<String>();
        name.add("abc");
        name.add("def");
        name.add("ghi");
        System.out.println(name);
        System.out.println(name.get(1));
        name.set(1,"jkl");
        System.out.println(name);
        name.remove(0);
        System.out.println(name);
        name.add(1,"sha");
        Collections.sort(name);
        System.out.println(name);
        System.out.println(name.getFirst());
        System.out.println(name.getLast());
        
    }
}
