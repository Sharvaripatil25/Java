interface SY
{
   int strength = 500;
   void SYtotal();
}
interface TY
{
   int strength = 400;
   void TYtotal();
}

public class interface5  implements SY,TY{
    public void SYtotal(){
        System.out.println("Strength of SY is "+SY.strength);
    }
    public void TYtotal(){
        System.out.println("Strength of TY is "+TY.strength);
    }
    public static void main(String[] args) {
        interface5 ob=new interface5();
        ob.SYtotal();
        ob.TYtotal();
    }
    
}
