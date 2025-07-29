package Task13;
import java.util.Scanner;
enum Day {
 SUNDAY,
 MONDAY,
 TUESDAY,
 WEDNESDAY,
 THURSDAY,
 FRIDAY,
 SATURDAY
}
public class Task13_1 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a day of the week (ex:MONDAY): ");
     String input = scanner.next().toUpperCase();
     try {
         Day day = Day.valueOf(input);
         switch (day) {
             case SUNDAY:
                 System.out.println("It's a holiday");
                 break;
             case SATURDAY:
                 System.out.println("Weekend vibes");
                 break;
             default:
                 System.out.println("It's a weekday: " + day);
         }
     } catch (IllegalArgumentException e) {
         System.out.println("Invalid day entered. Please enter a valid day like MONDAY.");
     }
     scanner.close();
 }
}