package Task3;
import java.util.Scanner;
public class Task3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        System.out.println("Binary of a: " + Integer.toBinaryString(a));
        System.out.println("Binary of b: " + Integer.toBinaryString(b));
        System.out.println("a & b (AND) = " + and + " (" + Integer.toBinaryString(and) + ")");
        System.out.println("a | b (OR)  = " + or + " (" + Integer.toBinaryString(or) + ")");
        System.out.println("a ^ b (XOR) = " + xor + " (" + Integer.toBinaryString(xor) + ")");
        sc.close();
    }
}
