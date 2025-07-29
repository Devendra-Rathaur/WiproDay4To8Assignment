package Task7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Task7_5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double input = scanner.nextDouble();
        BigDecimal bd = new BigDecimal(Double.toString(input));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Rounded value: " + bd);
        scanner.close();
    }
}
