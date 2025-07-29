package Task9;
import java.util.Scanner;
public class Task9_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0 && number % 5 == 0) {
            System.out.println("The number is even and divisible by 5.");
        } else {
            System.out.println("The number is NOT both even and divisible by 5.");
        }

        scanner.close();
    }
}
