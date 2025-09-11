import java.util.Scanner;

class Odev{
    int a;
   void read(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      a=sc.nextInt();
      sc.close();
   }

   void find_oddeven(){
      if(a%2==0){
        System.out.println("Even Number");
      }
      else{
        System.out.println("Odd Number");
      }
   }
}

public class oddeven{
   public static void main(String[] args) {
      Odev n=new Odev();
      n.read();
      n.find_oddeven();
      
   }
}