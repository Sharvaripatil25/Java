//Generic and Collection Framework
import java.util.*;

public class generic6 {
    static <T> void display(ArrayList<T> L){
        for(T i:L){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> L1=new ArrayList<>(Arrays.asList(1,2,3));
        display(L1);
        ArrayList<Double> L2=new ArrayList<>(Arrays.asList(5.5,6.7,8.9));
        display(L2);
    }
}
