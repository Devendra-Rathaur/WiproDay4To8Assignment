package New;
import java.util.Scanner;
public class Task1_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first byte value (between -128 to 127): ");
        byte a = scanner.nextByte();
        System.out.print("Enter second byte value (between -128 to 127): ");
        byte b = scanner.nextByte();
        int result = a + b;         
        if (result > Byte.MAX_VALUE|| result < Byte.MIN_VALUE) {
            System.out.println("Overflow occurred adding" + a +"and" + b);
        } else {
            byte sum = (byte) result;
            System.out.println("Sum is: " + sum);
        }
        scanner.close();
    }
}
