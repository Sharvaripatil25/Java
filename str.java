import java.util.Scanner;
public class str
{
   public static void main(String args[])
   {
	Scanner in = new Scanner(System.in);
	String str1;
	String str2;
	// Read and print string
	System.out.println("Enter string 1 :");
	str1 = in.next();
    in.nextLine() ;
    System.out.println("Enter String 2:");
	str2 = in.nextLine();    //read line of text
    System.out.println("String 1 is :" + str1); 
	System.out.println("String 2 is :" + str2);
	//Find length 
	int a=str1.length();
    int b=str2.length();
	System.out.println("Length of String 1 =" + a);
    System.out.println("Length of String 2 =" + b);
	//String concatenation
	String str3=str1.concat(str2);
	System.out.println("String str3 ="+ str3);
    }
}

