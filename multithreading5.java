class MyThread implements Runnable{
    String name;
    Thread t;
    MyThread(String s)
    {
        name=s;
        t=new Thread(this, name);
        System.out.println("MyThread"+name+this);
        t.start();
    }
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++){
                System.out.println("MyThread "+name+" i:"+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("My Thread"+this+" is interrupted");
        }
        
    }
}

public class multithreading5 {
    public static void main(String[] args){
        new MyThread("Test1");
        new MyThread("Test2");
        new MyThread("Test3");
        try{
            for(int i=0;i<5;i++){
            System.out.println("Main i:"+i);
            Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Exit from main");
    }
}
