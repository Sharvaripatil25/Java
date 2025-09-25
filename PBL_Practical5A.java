import java.util.Scanner;
public class PBL_Practical5A {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero not allowed!");
        return (double) a / b;
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.println("Addition = " + add(x, y));
        System.out.println("Subtraction = " + subtract(x, y));
        System.out.println("Multiplication = " + multiply(x, y));

        try {
            System.out.println("Division = " + divide(x, y));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Enter number for factorial: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " = " + factorial(n));

        sc.close();
    }
}