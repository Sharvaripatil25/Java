//Lamda Expression
//short way of writing anonymous function
//Implement functional interface(has one abstract method)
//Syntax:
//(parameters)->{body}
interface Test{
    void display();
}
class abc implements Test{
    public void display(){
        System.out.println("Hello");
    }
}

public class Lambda {
    public static void main(String[] args) {
        //using normal way
        Test t1=new abc();
        t1.display();
        //using lambda expression
        Test t2=()->{System.out.println("Hello from lambda");};
        t2.display();
    }
}
