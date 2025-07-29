package Task9;
import java.util.Scanner;
public class Task9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle 1: ");
        int angle1 = scanner.nextInt();
        System.out.print("Enter angle 2: ");
        int angle2 = scanner.nextInt();
        System.out.print("Enter angle 3: ");
        int angle3 = scanner.nextInt();
        int sum = angle1 + angle2 + angle3;
        if (angle1 > 0 && angle2 > 0 && angle3 > 0 && sum == 180) {
            System.out.println("Valid Triangle.");
        } else {
            System.out.println("Invalid Triangle.");
        }
        scanner.close();
    }
}
