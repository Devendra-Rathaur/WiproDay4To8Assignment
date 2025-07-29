package Task3;
import java.util.Scanner;
public class Task3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Person A: ");
        int ageA = sc.nextInt();
        System.out.print("Enter age of Person B: ");
        int ageB = sc.nextInt();
        System.out.println("A == B : " + (ageA == ageB));
        System.out.println("A != B : " + (ageA != ageB));
        System.out.println("A > B  : " + (ageA > ageB));
        System.out.println("A < B  : " + (ageA < ageB));
        System.out.println("A >= B : " + (ageA >= ageB));
        System.out.println("A <= B : " + (ageA <= ageB));
        sc.close();
    }
}
