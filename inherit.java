class A{
    int i,j;
    void showij(){
        System.out.println("i:"+i);
        System.out.println("j:"+j);
    }
}

class B extends A{
    int k;
    void add(){
        k=i+j;
        System.out.println("k:"+k);
    }
}

public class inherit {
    public static void main(String[] args) {
        A superob=new A();
        B subob=new B();
        superob.i=10;
        superob.j=20;
        superob.showij();

        subob.i=15;
        subob.j=30;
        subob.showij();
        subob.add();
       
    }
    
}
