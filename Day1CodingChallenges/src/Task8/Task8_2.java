package Task8;
import java.util.Scanner;
public class Task8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        if (a >= b) {
            if (a >= c) {
                System.out.println("Largest number is: " + a);
            } else {
                System.out.println("Largest number is: " + c);
            }
        } else {
            if (b >= c) {
                System.out.println("Largest number is: " + b);
            } else {
                System.out.println("Largest number is: " + c);
            }
        }
        scanner.close();
    }
}
