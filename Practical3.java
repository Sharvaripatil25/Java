import java.util.Scanner;
class MIT{
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
class Department extends MIT{
    String Dept;
    void getD(){
        Scanner p=new Scanner(System.in);
        System.out.println("Enter Departement:");
        Dept=p.nextLine();
    }
    void display(){
        super.display();
        System.out.println("Department:"+Dept);
     }
  
}
class Branch extends Department{
      String branch;
      void getb(){
         Scanner q= new Scanner(System.in);
         System.out.println("Enter Branch");
         branch=q.nextLine();
      }
      void display(){
        super.display();
        System.out.println("Branch:"+branch);
      }
}

public class Practical3 {
    public static void main(String[] args) {
        Branch b = new Branch();

        b.getd();   
        b.getD();   
        b.getb();   
        b.display();
    }
}
