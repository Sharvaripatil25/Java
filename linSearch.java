import java.util.Scanner;

public class linSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements in array:");
        n=sc.nextInt();
        int A[];
        A=new int[n];
        System.out.println("Enter Elements of Array");
        for(int i=0;i<n;i++){
             A[i]=sc.nextInt();
        }
        int key;
        System.out.println("Enter number to be searched:");
        key=sc.nextInt();
        int found=0;
        for(int i=0;i<n;i++){
            if(A[i]==key){
                System.out.println("Number Found at location "+ (i+1));
                found=1;
            }
        }
        if(found==0){
            System.out.println("Number not found");
        }
        
    }
}
