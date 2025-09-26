//Synchronization -- synchronized Ensures that shared resources will be used by one thread at a time

class callme{
   synchronized void call(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    
    }
}
class MyThread implements Runnable{
    Thread t;
    String s; //message
    callme c;
    MyThread(callme c1,String s1){
        s=s1;
        c=c1;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        c.call(s);
    }
}
public class sync {
    public static void main(String[] args){
        callme  ob = new callme();
        MyThread ob1 = new MyThread(ob,"MIT");
        MyThread ob2 = new MyThread(ob,"Pune");
        MyThread ob3 = new MyThread(ob,"India");

        try{
            System.out.println("main waiting for thread to finish");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch(InterruptedException e){
            System.out.println("main interrupted");
        }
            
    }
}