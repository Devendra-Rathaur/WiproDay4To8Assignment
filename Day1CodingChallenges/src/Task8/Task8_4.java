package Task8;
import java.util.Scanner;
public class Task8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age <= 12) {
            System.out.println("You are a Child.");
        } else if (age <= 19) {
            System.out.println("You are a Teenager.");
        } else if (age <= 35) {
            System.out.println("You are a Young Adult.");
        } else if (age <= 59) {
            System.out.println("You are an Adult.");
        } else {
            System.out.println("You are a Senior Citizen.");
        }
        scanner.close();
    }
}
