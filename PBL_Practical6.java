import java.util.Scanner;
class Person {
    String name;
    int age;
    int id;

    void setData(String n, int a, int i) {
        name = n;
        age = a;
        id = i;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String course;
    double grade;

    void setStudentData(String n, int a, int i, String c, double g) {
        setData(n, a, i);   // call base class method
        course = c;
        grade = g;
    }

    void display() {
        super.display();   // display Person info
        System.out.println("Course: " + course + ", Grade: " + grade);
    }
}
class Employee extends Person {
    String department;
    double salary;

    void setEmployeeData(String n, int a, int i, String d, double s) {
        setData(n, a, i);
        department = d;
        salary = s;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department + ", Salary: " + salary);
    }
}

public class PBL_Practical6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[2];
        Employee[] employees = new Employee[2];
        System.out.println("Enter details for 2 students:");
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // clear buffer
            System.out.print("Enter course: ");
            String course = sc.nextLine();
            System.out.print("Enter grade: ");
            double grade = sc.nextDouble();
            sc.nextLine();

            students[i].setStudentData(name, age, id, course, grade);
        }
        System.out.println("\nEnter details for 2 employees:");
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // clear buffer
            System.out.print("Enter department: ");
            String dept = sc.nextLine();
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employees[i].setEmployeeData(name, age, id, dept, salary);
        }

        // Display all records
        System.out.println("Student Records:");
        for (Student s : students) {
            s.display();
        }

        System.out.println("Employee Records:");
        for (Employee e : employees) {
            e.display();
        }

        sc.close();
    }
}
