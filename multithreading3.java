class Test1 implements Runnable{
    public void run(){
        try{
        for(int i=0;i<5;i++){
            System.out.println("Thread 1 Test i = "+i);
            Thread.sleep(1000);
        }
        }
        catch(InterruptedException e){
            System.out.println("Test 1 Interrupted" +e);
        }
        System.out.println("Exit from Thread 1");
    }
}
class Test2 implements Runnable{
    public void run(){
        try{
        for(int j=0;j<5;j++){
            System.out.println("Thread 2 Test j = "+j);
            Thread.sleep(1000);
        }
        }
        catch(InterruptedException e){
            System.out.println("Test 2 Interrupted" +e);
        }
        System.out.println("Exit from Thread 2");
    }


}
class Test3 implements Runnable{
     public void run(){
        try{
        for(int k=0;k<5;k++){
            System.out.println("Thread 3 Test k = "+k);
            Thread.sleep(1000);
        }
        }
        catch(InterruptedException e){
            System.out.println("Test 3 Interrupted" +e);
        }    
        System.out.println("Exit from Thread 3");
    }
}

public class multithreading3 {
    public static void main(String[] args) {
        Test1 t1=new Test1();
        Thread A=new Thread(t1);
        Test2 t2=new Test2();
        Thread B=new Thread(t2);
        Test3 t3=new Test3();
        Thread C=new Thread(t3);
        A.start();
        B.start();
        C.start();
        try{
            for(int x=0;x<5;x++){
                System.out.println("main thread x = "+x);
                Thread.sleep(10000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread Interrupted" +e);
        }
    }
}
