//collection framework-organize/manipulate data efficiently
//1.List(interface)-ordered data,can be duplicated,access index
// list classes-ArrayList and LinkedList--method add,get,set,remove
//2.Set(interface)-unique data,
//3.Map(interface)-key-value pair,unique key,access with key

import java.util.ArrayList;

public class collection {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<String>();
        name.add("abc");
        name.add("def");
        name.add("ghi");
        System.out.println(name);
    }
}
