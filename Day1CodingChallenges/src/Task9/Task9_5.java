package Task9;
import java.util.Scanner;
public class Task9_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 0) {
            System.out.println("Invalid age entered.");
        } else {
            if (age >= 18) {
                System.out.println("Eligible to Vote.");
                System.out.println("Eligible for Driving License.");
            } else {
                System.out.println("Not eligible to Vote.");
                System.out.println("Not eligible for Driving License.");
            }

            if (age >= 21) {
                System.out.println("Eligible for a Job.");
            } else {
                System.out.println("Not eligible for a Job.");
            }
        }
        scanner.close();
    }
}
