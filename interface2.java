import java.util.Scanner;
interface shape
{
    float pi=3.14f;
    String unit = "sq cm";
}

public class interface2 implements shape {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of Circle:");
        int r=sc.nextInt();
        double area=pi*r*r;
        System.out.println("Area of Circle is "+area +unit);
    }
}
