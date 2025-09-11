import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class ECEStudent extends Student {
    
    void showBranch() {
        System.out.println("Branch: ECE" );
    }
}

class ECEAIMLStudent extends Student {
    
    void showBranch() {
        System.out.println("Branch: ECE(AIML)" );
    }
}

class ENCEStudent extends Student {
    
    void showBranch() {
        System.out.println("Branch: E&CE");
    }
}

public class hierarchical {
    public static void main(String[] args) {
        ECEStudent ece = new ECEStudent();
        ece.getDetails();
        ece.displayDetails();
        ece.showBranch();

        ECEAIMLStudent eceAiml = new ECEAIMLStudent();
        eceAiml.getDetails();
        eceAiml.displayDetails();
        eceAiml.showBranch();

        ENCEStudent ence = new ENCEStudent();
        ence.getDetails();
        ence.displayDetails();
        ence.showBranch();
    }
}
