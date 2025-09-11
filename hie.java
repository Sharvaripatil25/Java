import java.util.Scanner;
class MIT
{
   String name;
   int Roll_No;
   void getd(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Name:");
      name=sc.nextLine();
      System.out.println("Enter Roll No:");
      Roll_No=sc.nextInt();
   }
   void display(){
     System.out.println("Name: "+name);
     System.out.println("Roll No.: "+Roll_No);
   }
}

class EEE extends MIT
{
   void showdept(){
    System.out.println("Department:EEE");
   }
}
class mech extends MIT
{
   void showdept(){
    System.out.println("Department:mech");
   }
}
class comp extends MIT
{
   void showdept(){
    System.out.println("Department:comp");
   }
}

public class hie {
    public static void main(String[] args) {
        EEE E=new EEE();
        E.getd();
        E.display();
        E.showdept();

        mech m=new mech();
        m.getd();
        m.display();
        m.showdept();

        comp c=new comp();
        c.getd();
        c.display();
        c.showdept();
    }
    
}
