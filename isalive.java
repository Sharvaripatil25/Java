//isAlive() and join()
//one thread can know when another has finished
//isAlive()-weather thread has finished
//join()-wait for another thread to finish
class MyThread implements Runnable{
    Thread t;
    String name;
    MyThread(String s){
        name=s;
        t=new Thread(this,name);
        System.out.println("MyThread" +t);
        t.start();
    }
    public void run(){
        try{
        for(int i=0;i<5;i++){
            System.out.println("MyThread " + name + "i: "+i);
            Thread.sleep(1000);
        }
        }
        catch(InterruptedException e){
             System.out.println("MyThread " + name +" is interrupted");
        }
        System.out.println("Exited from "+name);
    }
}
public class isalive {
    public static void main(String[] args){
        MyThread ob1 = new MyThread("T1");
        MyThread ob2 = new MyThread("T2");
        MyThread ob3 = new MyThread("T3");

        System.out.println("Is T1 alive "+ob1.t.isAlive());
        System.out.println("Is T2 alive "+ob2.t.isAlive());
        System.out.println("Is T3 alive "+ob3.t.isAlive());

        try{
            System.out.println("main waiting for thread to finish");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch(InterruptedException e){
            System.out.println("main interrupted");
        }
        System.out.println("Is T1 alive "+ob1.t.isAlive());
        System.out.println("Is T2 alive "+ob2.t.isAlive());
        System.out.println("Is T3 alive "+ob3.t.isAlive());
            
    }
}
