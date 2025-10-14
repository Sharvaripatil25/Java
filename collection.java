//collection framework-organize/manipulate data efficiently
//1.List(interface)-ordered data,can be duplicated,access index
// list classes-ArrayList and LinkedList--method add,get,set,remove
//2.Set(interface)-unique data,
//3.Map(interface)-key-value pair,unique key,access with key

//1.List-arrayList:
import java.util.ArrayList;
import java.util.Collections;


public class collection {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<String>();
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
        name.clear();
        System.out.println(name);
        var nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(4);
        nums.add(3);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
        
    }
}
