class MyThread extends Thread{
    String name;
    Thread t;
    MyThread(String s)
    {
        name=s;
        t=new Thread(this, name);
        System.out.println("MyThread "+name+t);
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
            System.out.println("My Thread"+name+" is interrupted");
        }
    System.out.println("Exit from MyThread");
        
    }
}
public class multithreading6 {
    
}
