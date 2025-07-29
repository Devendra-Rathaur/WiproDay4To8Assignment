package Task10;
import java.util.Scanner;
public class Task10_2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("Month:January");
                break;
            case 2:
                System.out.println("Month:February");
                break;
            case 3:
                System.out.println("Month:March");
                break;
            case 4:
                System.out.println("Month:April");
                break;
            case 5:
                System.out.println("Month:May");
                break;
            case 6:
                System.out.println("Month:June");
                break;
            case 7:
                System.out.println("Month:July");
                break;
            case 8:
                System.out.println("Month:August");
                break;
            case 9:
                System.out.println("Month:September");
                break;
            case 10:
                System.out.println("Month:October");
                break;
            case 11:
                System.out.println("Month:November");
                break;
            case 12:
                System.out.println("Month:December");
                break;
            default:
                System.out.println("Invalid month number!enter b/w 1–12.");
        }
        scanner.close();
    }
}
