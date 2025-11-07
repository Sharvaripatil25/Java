
class Num<T>
{
    T n1,n2;
    Num(T n1, T n2){
       this.n1=n1;
       this.n2=n2;
    }
}
class Arith<T> extends Num<T>{
      Arith(T a,T b){
        super(a,b);
      }
      void display(){
        System.out.println("n1:"+n1);
        System.out.println("n2:"+n2);
      }
}
public class generic7 {
    
}
