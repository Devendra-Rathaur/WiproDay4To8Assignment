package Task2;
import java.util.Scanner;
public class Task2_4  {
    public static final double PI = 3.14159;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of a circle: ");
        double radius = sc.nextDouble();
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Circumference: %.2f\n", circumference);
        sc.close();
    }
}
