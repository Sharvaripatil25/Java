import java.util.Scanner;
public class string
{
   public static void main(String args[])
   {
	Scanner in = new Scanner(System.in);
	String str1;
	String str2;
	// Read and print string
	System.out.println("Enter string");
	str1 = in.next();   //read single word
	str2 = in.nextLine();    //read line of text
	System.out.println("String 1 is :" + str1);
	System.out.println("String 2 is :" + str2);
	//Find length 
	int a=str2.length();
	System.out.println("Length of String a =" + a);
	//String concatenation
	String str3=str1.concat(str2);
	System.out.println("String str3:"+str3);
    }
}