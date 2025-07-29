package Task9;
import java.util.Scanner;
public class Task9_4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);
        if (Character.isLetter(ch)) {
            char lowerCh = Character.toLowerCase(ch);
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                System.out.println("It is a Vowel.");
            } else {
                System.out.println("It is a Consonant.");
            }
        } else if (Character.isDigit(ch)) {
            System.out.println("It is a Digit.");
        } else {
            System.out.println("It is a Special Character.");
        }
        scanner.close();
    }
}
