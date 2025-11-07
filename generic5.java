// find maximum of three using generics
//use comparable interface
class Maximum<T extends Comparable<T>>{
   T A,B,C;
   Maximum(T a,T b,T c){
         A=a;
         B=b;
         C=c;
   }
   void findMax(){
    T max=A;
    if(B.compareTo(max)>0){
        max=B;
    }
    if(C.compareTo(max)>0){
        max=C;
    }
    System.out.println("Maximum:"+max);
    }
}

public class generic5 {
    public static void main(String args[]){
        Maximum<Integer> ob1=new Maximum<>(10,20,30);
        ob1.findMax();
        Maximum<Double> ob2=new Maximum<>(10.5,8.9,7.9);
        ob2.findMax();
        Maximum<String> ob3=new Maximum<>("Apple","Banana","Grapes");
        ob3.findMax();
    }
}
