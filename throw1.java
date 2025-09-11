//throws-method causing exception that it does not handle
//return_type method_name(parameters) throws exceptionlist
//{//method body}
import java.util.Scanner;
public class throw1 {
    static void test() throws IllegalAccessException
    {
        Scanner p= new Scanner(System.in);
        System.out.println("Enter Age:");
        int age=p.nextInt();
        if(age<18){
            throw new IllegalAccessException("Invalid Age to vote");
        }
        else{
            System.out.println("Valid age to vote");
        }
    }
    public static void main(String[] args){
        try{
           test();
        }
    
        catch(IllegalAccessException e)
        {
            System.out.println("In main Error:" +e);
        }

    }
}
