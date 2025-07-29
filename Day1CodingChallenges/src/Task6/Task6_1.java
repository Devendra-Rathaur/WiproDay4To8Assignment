package Task6;
import java.util.Scanner;
public class Task6_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int length = input.length();
        System.out.println("Length of the string:" + length);
        if (length > 0) {
            System.out.println("First character:" + input.charAt(0));
            System.out.println("Last character:" + input.charAt(length - 1));
        }
        if (length >= 5) {
            System.out.println("Substring from index 1 to 4:" + input.substring(1, 5));
            System.out.println("Substring from index 3 to end:" + input.substring(3));
        } else {
            System.out.println("String too short to extract advance substrings.");
        }
        sc.close();
    }
}
