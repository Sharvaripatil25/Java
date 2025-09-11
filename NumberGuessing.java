import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        int myNumber;
        myNumber=(int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);
        int userNumber;
        char ch;
        do{
            System.out.println("Guess any Number between 1 to 100 :");
            userNumber=sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("CORRECT NUMBER!!!");
                break;
            }

            else if(userNumber>myNumber){
                System.out.println("Your number is too large");
            }
            else{
                System.out.println("Your number is too small");
            }
             System.out.println("Do you Want to continue Y/N");
             
             ch=sc.next().charAt(0);
        }
        while(ch=='y' || ch=='Y');
        sc.close();
    }
    
}
