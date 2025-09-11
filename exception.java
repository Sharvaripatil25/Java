import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter index:");
        int i=sc.nextInt();
        int ar[]={3,5,7,8,2};
        try{
            int d=10/a;
            System.out.println("Outer Division Result="+d);
            try{
                if(a==1){
                    int x=20/(1-a);
                    System.out.println("Inner Division result="+x);
                }
                if (a==2){
                    int z=ar[i];
                    System.out.println("Element at i=" +z);
                }
            }
            catch(ArithmeticException e3)
        {
           System.out.println("Inner Division Error:" +e3.getMessage());
        }
            catch(ArrayIndexOutOfBoundsException e1)
            {
                System.out.println("Index Error:"+e1);
            }
        }
        catch(ArithmeticException e2)
        {
           System.out.println(" Outer Division Error:" +e2);
        }
    }
    
}
