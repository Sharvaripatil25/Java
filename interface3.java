interface shape{
    double find(double d);
}

public class interface3 implements shape {
    public double find(double d){
          return d*d;
    }
    public static void main(String[] args) {
        interface3 ob=new interface3();
        System.out.println("Area of square is "+ ob.find(3.4));
    }
}
