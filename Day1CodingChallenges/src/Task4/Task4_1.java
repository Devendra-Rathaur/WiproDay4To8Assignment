package Task4;
import java.util.Scanner;
public class Task4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine().trim();
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine().trim();
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
        sc.close();
    }
}
