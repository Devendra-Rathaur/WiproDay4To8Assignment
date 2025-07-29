package Task5;
import java.util.Scanner;
public class Task5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String original = sc.nextLine();
        System.out.print("Enter start index to delete: ");
        int start = sc.nextInt();
        System.out.print("Enter end index to delete: ");
        int end = sc.nextInt();
        if (start >= 0 && end <= original.length() && start < end) {
            StringBuilder sb = new StringBuilder(original);
            sb.delete(start, end);
            System.out.println("Updated string: " + sb.toString());
        } else {
            System.out.println("Invalid indices. No changes made.");
        }
        sc.close();
    }
}
