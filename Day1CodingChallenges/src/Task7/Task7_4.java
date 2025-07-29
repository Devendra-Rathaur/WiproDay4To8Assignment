package Task7;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Task7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        LocalDate userDate = LocalDate.parse(inputDate);
        LocalDate resultDate = userDate.plusDays(5);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = resultDate.format(formatter);
        System.out.println("Date after 5 days: " + formattedDate);
        scanner.close();
    }
}
