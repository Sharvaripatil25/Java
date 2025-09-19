class Test1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread 1 Test i = "+i);
        }
        System.out.println("Exit from Thread 1");
    }
}
class Test2 implements Runnable{
    public void run(){
        for(int j=0;j<5;j++){
            System.out.println("Thread 2 Test j = "+j);
        }
        System.out.println("Exit from Thread 2");
    }


}
class Test3 implements Runnable{
     public void run(){
        for(int k=0;k<5;k++){
            System.out.println("Thread 3 Test k = "+k);
        }
        System.out.println("Exit from Thread 3");
    }
}

public class multithreading2 {
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
    }
}
