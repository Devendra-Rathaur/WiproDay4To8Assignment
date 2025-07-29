package Task4;
import java.util.Scanner;
public class Task4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter your city: ");
        String city = sc.nextLine();
        System.out.print("Enter your country: ");
        String country = sc.nextLine();
        String formatted = String.format("Full Name: %s %s | Location: %s, %s", firstName.trim(), lastName.trim(), city.trim(), country.trim());
        System.out.println(formatted);
        sc.close();
    }
}
