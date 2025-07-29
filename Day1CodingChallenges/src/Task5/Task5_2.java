package Task5;
import java.util.Scanner;
public class Task5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your middle name: ");
        String middleName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(firstName).append(" ").append(middleName).append(" ").append(lastName);
        System.out.println("Full Name: " + sb.toString());
        sc.close();
    }
}
