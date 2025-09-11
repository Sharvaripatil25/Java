//creating subclass of exception
import java.util.Scanner;
class MyException extends Exception
{
    public MyException(String message)
    {
        super(message);
    }
}


public class Exceptionsubclass {
    static void test(int age) throws MyException {
        if(age<18){
            throw new MyException("Invalid to Vote");
        }
        System.out.println("Valid to Vote");
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=sc.nextInt();
        try{
           test(age);
        }
    
        catch(MyException e)
        {
            System.out.println("Age Error:" +e);
        }
    }
    
}
