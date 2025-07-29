package Task11;
import java.util.Scanner;
public class Task11_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to skip(use 'continue'): ");
        int skipNumber = scanner.nextInt();
        System.out.print("Enter a number to stop (use 'break'): ");
        int breakNumber = scanner.nextInt();
        System.out.println("\n--- Loop with break and continue ---");
        for (int i = 1; i <= 10; i++) {
            if (i == skipNumber) {
                System.out.println("Skipping number: " + i);
                continue;
            }
            if (i == breakNumber) {
                System.out.println("Breaking loop at: " + i);
                break;
            }
            System.out.println("Number: " + i);
        }
        scanner.close();
    }
}