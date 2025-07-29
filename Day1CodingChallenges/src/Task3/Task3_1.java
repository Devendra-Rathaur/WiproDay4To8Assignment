package Task3;
import java.util.Scanner;
public class Task3_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second integer (b): ");
        int b = sc.nextInt();
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        if (b != 0) {
            System.out.println("Division (a / b): " + (a / b));
            System.out.println("Modulus (a % b): " + (a % b));
        } else {
            System.out.println("Division and Modulus not possible (b is 0)");
        }
        sc.close();
    }
}
