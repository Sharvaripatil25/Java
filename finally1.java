//finally-code in this block will be executed even if there is no exception
import java.util.Scanner;
public class finally1 {
    static void test()
    {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=p.nextInt();
        try{
            int d=10/a;
            System.out.println("Division d=" +d);
            return;  //prog 2 modification
        }
        finally{
            System.out.println("Inside finally");
        }
       // System.out.println("Outside finally");
    }
    public static void main(String[] args) {
        try{
           test();
        }
    
        catch(ArithmeticException e)
        {
            System.out.println("Division Error:" +e);
        }
    }
    
}
