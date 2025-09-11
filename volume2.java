import java.util.Scanner;

// Class with method to calculate volume
class V1 {
        private int l;
        private int b;
        private int w;
    void read(){
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        sc.close();
    }
    void vol() {
        int v=l*b*w;
        System.out.println("Volume=" +v);
    }
}

public class volume2 {
    public static void main(String[] args) {
        V1 ob=new V1();
        //ob.read();
       // ob.vol();

        //ob.l=10;
        //ob.b=20;
        //ob.w=25;
        ob.vol();
    }
}
