package Task3;
import java.util.Scanner;
public class Task3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input values
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();
        // Logical AND
        boolean eligibleForDiscount = (age < 25) && isStudent;
        System.out.println("Eligible for student discount: " + eligibleForDiscount);
        // Logical OR
        boolean needsID = (age < 18) || isStudent;
        System.out.println("Needs student ID or parental consent: " + needsID);
        // Logical NOT
        boolean notStudent = !isStudent;
        System.out.println("Not a student: " + notStudent);
        sc.close();
    }
}
