//Generic programming in java
//same method,class,interface can be used for different data types
//code reusability,flexibility,type safety
class GenericClass<T>{
    T data;
    void set(T d){
        data=d;
    }
    void get(){
        System.out.println("Data: "+data);
    }
}
public class Generic {
    public static void main(String[] args) {
        GenericClass<Integer> obj1=new GenericClass<>();
        obj1.set(10);
        obj1.get();
        GenericClass<String> obj2=new GenericClass<>();
        obj2.set("Hello");
        obj2.get();
    }
}
