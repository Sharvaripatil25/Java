import java.util.Scanner;
class MIT
{
   String name;
   int PRN;
   void getd(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Name:");
      name=sc.nextLine();
      System.out.println("Enter PRN:");
      PRN=sc.nextInt();
   }
   void display(){
     System.out.println("Name: "+name);
     System.out.println("Roll No.: "+PRN);
   }
}

class EEE extends MIT
{
   int Java;
   int CN;
   int Total;
   void get_E(){
      Scanner p=new Scanner(System.in);
      System.out.println("Enter Marks:");
      System.out.println("Java:");
      Java=p.nextInt();
      System.out.println("CN:");
      CN=p.nextInt();
   }
   void display(){
      super.display();
      System.out.println("Java Marks:"+Java);
      System.out.println("CN Marks:"+CN);
      System.out.println("Total:"+Java+CN);
   }
}
class mech extends MIT
{
    int mechanics;
    int PE;
    int Total;
   void get_M(){
      Scanner p=new Scanner(System.in);
      System.out.println("Enter Marks:");
      System.out.println("Java:");
      mechanics=p.nextInt();
      System.out.println("CN:");
      PE=p.nextInt();
   }
   void display(){
      super.display();
      System.out.println("Mechanics Marks:"+mechanics);
      System.out.println("PE Marks:"+PE);
      System.out.println("Total:"+mechanics+PE);
   }
}
class comp extends MIT
{
   void showdept(){
    System.out.println("Department:comp");
   }
}

public class hie2 {
    public static void main(String[] args) {
        EEE E=new EEE();
        E.getd();
        E.get_E();
        E.display();

        mech m=new mech();
        m.getd();
        m.get_M();
        m.display();
        

        comp c=new comp();
        c.getd();
        c.display();
        c.showdept();
    }
    
}
