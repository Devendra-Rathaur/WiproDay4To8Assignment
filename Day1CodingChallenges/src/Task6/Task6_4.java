package Task6;
import java.util.Scanner;
public class Task6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String upper = input.toUpperCase();
        String lower = input.toLowerCase();
        System.out.println("Upper Case: " + upper);
        System.out.println("Lower Case: " + lower);
        sc.close();
    }
}
