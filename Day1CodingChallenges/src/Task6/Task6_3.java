package Task6;
import java.util.Scanner;
public class Task6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        if (cleaned.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
