package Task8;
import java.util.Scanner;
public class Task8_5
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        double percentage = scanner.nextDouble();
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid percentage.");
        } 
        else if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }
        scanner.close();
    }
}
