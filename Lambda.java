//Lamda Expression
//short way of writing anonymous function
//Implement functional interface(has one abstract method)
//Syntax:
//(parameters)->{body}
interface Test{
    void add(int a,int b);
}
class abc implements Test{
    public void add(int a,int b){
        System.out.println(a+b);
    }
}

public class Lambda {
    public static void main(String[] args) {
        //using normal way
        Test t1=new abc();
        t1.add(3,4);
        //using lambda expression
        Test t2=(a,b)->{System.out.println(a+b);};
        t2.add(4,5);
    }
}
