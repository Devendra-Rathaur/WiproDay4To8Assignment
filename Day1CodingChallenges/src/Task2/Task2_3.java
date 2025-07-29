package Task2;
import java.util.Scanner;
public class Task2_3 {
    int num = 100;
    public void show(int num) {
        System.out.println("Local (method parameter) num: " + num);
        System.out.println("Instance variable num: " + this.num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task2_3 obj = new Task2_3();
        System.out.print("Enter a number: ");
        int userInput = sc.nextInt();
        obj.show(userInput);
        sc.close();
    }
}
