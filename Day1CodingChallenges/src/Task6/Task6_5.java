package Task6;
import java.util.Scanner;
public class Task6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Cleaned String (no spaces or special characters): " + cleaned);
        sc.close();
    }
}
