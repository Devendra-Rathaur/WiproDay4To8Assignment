package Task5;
import java.util.Scanner;
public class Task5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter the index to replace: ");
        int index = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter the new character: ");
        char newChar = sc.nextLine().charAt(0);
        if (index >= 0 && index < input.length()) {
            StringBuilder sb = new StringBuilder(input);
            sb.setCharAt(index, newChar);
            System.out.println("Modified string: " + sb.toString());
        } else {
            System.out.println("Invalid index. No changes made.");
        }
        sc.close();
    }
}
