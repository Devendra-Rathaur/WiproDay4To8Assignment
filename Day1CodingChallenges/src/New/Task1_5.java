package New;
import java.util.Scanner;
public class Task1_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a byte:");
        byte b = sc.nextByte();
        System.out.print("Enter a short:");
        short s = sc.nextShort();
        System.out.print("Enter an int:");
        int i = sc.nextInt();
        System.out.print("Enter a long:");
        long l = sc.nextLong();
        System.out.print("Enter a float:");
        float f = sc.nextFloat();
        System.out.print("Enter a double:");
        double d = sc.nextDouble();
        System.out.print("Enter a char:");
        char c = sc.next().charAt(0);
        System.out.print("Enter a boolean:");
        boolean bool = sc.nextBoolean();
        sc.close();
        System.out.printf("\nFormatted Output:\nbyte: %d\nshort: %d\nint: %d\nlong: %d\nfloat: %.2f\ndouble: %.2f\nchar: %c\nboolean: %b\n",b, s, i, l, f, d, c, bool
        );
    }
}