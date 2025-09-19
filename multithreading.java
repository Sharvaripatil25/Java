//Two ways to create a Thread:
//Extending Thread class:java.util.Thread
//implementing:java.util.Runnable
//Step 1:
//class ABC extend Thread{  }
//step2:
//override run() method available in Thread class
//Syntax of run():
/*public void run()
{ 
    
}*/
//Step 3:
//Call start() method

// Experiment 7 for PBL

class Test1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread 1 Test i = "+i);
        }
        System.out.println("Exit from Thread 1");
    }
}
class Test2 extends Thread{
    public void run(){
        for(int j=0;j<5;j++){
            System.out.println("Thread 2 Test j = "+j);
        }
        System.out.println("Exit from Thread 2");
    }


}
class Test3 extends Thread{
     public void run(){
        for(int k=0;k<5;k++){
            System.out.println("Thread 3 Test k = "+k);
        }
        System.out.println("Exit from Thread 3");
    }
}

public class multithreading {
    public static void main(String[] args) {
        Test1 t1=new Test1();
        Test2 t2=new Test2();
        Test3 t3=new Test3();
        t1.start();
        t2.start();
        t3.start();
    }

}
