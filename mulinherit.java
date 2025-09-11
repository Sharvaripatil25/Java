import java.util.Scanner;

class Student{
    
    String name;
    int Roll_no;
    void get_d()
    {
    System.out.println("Enter Name and Roll No.:");
    Scanner sc=new Scanner(System.in);
    name=sc.next();
    Roll_no=sc.nextInt();
    
    }
}

class marks extends Student{
     
     int PE,Java,CN;
     void get_m()
     {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter Marks");
        System.out.println("PE:");
        PE=p.nextInt();
        System.out.println("Java:");
        Java=p.nextInt();
        System.out.println("CN:");
        CN=p.nextInt();
        
     }
}

class Result extends marks{
    int SM,Total;
    void find_total()
    {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter SM:");
        SM=p.nextInt();
        Total=PE+Java+CN+SM;
    }

    void display()
    {
      System.out.println("Name:"+name);
      System.out.println("Roll No:"+Roll_no);
      System.out.println("PE:"+PE);
      System.out.println("Java:"+Java);
      System.out.println("CN:"+CN);
      System.out.println("SM:"+SM);
      System.out.println("Total:"+Total);
    }
}


public class mulinherit {
    public static void main(String[] args) {
        Result st=new Result();
        st.get_d();
        st.get_m();
        st.find_total();
        st.display();
    }
}
