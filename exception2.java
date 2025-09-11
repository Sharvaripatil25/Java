//try,catch,throw,throws,finally
/*throw: Throw exception explicitly_prog 1
import java.util.Scanner;
public class exception2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age:");
        int age=sc.nextInt();
        try{
        if(age<18){
            throw new ArithmeticException("Invalid Age to vote");
        }
        else{
            System.out.println("valid to vode");
        }
    }
        catch(ArithmeticException e)
        {
            System.out.println("Error:" +e);
        }
    }
    
}*/

//prog 2
import java.util.Scanner;
public class exception2 {
    static void test(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age:");
        int age=sc.nextInt();
        try{
        if(age<18){
            throw new ArithmeticException("Invalid Age to vote");
        }
        else{
            System.out.println("valid to vode");
        }
    }
        catch(ArithmeticException e)
        {
            System.out.println("Inside method Error:" +e);
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
           test();
        }
    
        catch(ArithmeticException e1)
        {
            System.out.println("In main Error:" +e1);
        }
    }
    
}

