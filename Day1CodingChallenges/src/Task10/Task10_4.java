package Task10;
import java.util.Scanner;
public class Task10_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Welcome to Java Bistro----------");
        System.out.println("Menu:");
        System.out.println("1. Idli -30/-");
        System.out.println("2. Dosa -50/-");
        System.out.println("3. Tea -15/-");
        System.out.println("4. Coffee -20/-");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();
// Enhanced switch expression
        String message = switch (choice) {
            case 1 -> "You ordered Idli. Price:30/-";
            case 2 -> "You ordered Dosa. Price: 50/-";
            case 3 -> "You ordered Tea. Price: 15/-";
            case 4 -> "You ordered Coffee. Price: 20/-";
            case 5 -> "Exiting... Thank you for visiting!";
            default -> "Invalid choice. Please choose from 1 to 5.";
        };
        System.out.println(message);
        scanner.close();
    }
}