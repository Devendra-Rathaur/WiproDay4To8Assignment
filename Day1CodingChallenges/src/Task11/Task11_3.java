package Task11;
import java.util.Scanner;
public class Task11_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();
        long factorial = 1;
        if (num < 0) {
            System.out.println("Factorial is not for negative numbers.");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
        scanner.close();
    }
}
