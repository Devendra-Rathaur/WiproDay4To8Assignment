package Task5;
import java.util.Scanner;
public class Task5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String original = sc.nextLine();
        System.out.print("Enter the word to insert: ");
        String wordToInsert = sc.nextLine();
        System.out.print("Enter the index where to insert: ");
        int index = sc.nextInt();
        if (index >= 0 && index <= original.length()) {
            StringBuilder sb = new StringBuilder(original);
            sb.insert(index, wordToInsert);
            System.out.println("Updated string: " + sb.toString());
        } else {
            System.out.println("Invalid index. No changes made.");
        }
        sc.close();
    }
}
