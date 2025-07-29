package Task8;
import java.util.Scanner;
public class Task8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String validUsername = "admin";
        String validPassword = "password123";
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();
        if (inputUsername.equals(validUsername)) {
            if (inputPassword.equals(validPassword)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid password.");
            }
        } else {
            System.out.println("Invalid username.");
        }
        scanner.close();
    }
}
