package Task13;
import java.util.Scanner;
enum TrafficSignal {
 RED,
 YELLOW,
 GREEN
}
public class Task13_2{
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter traffic signal (RED, YELLOW, GREEN): ");
     String input = scanner.next().toUpperCase();
     try {
         TrafficSignal signal = TrafficSignal.valueOf(input);
         switch (signal) {
             case RED:
                 System.out.println("STOP");
                 break;
             case YELLOW:
                 System.out.println("READY");
                 break;
             case GREEN:
                 System.out.println("GO");
                 break;
         }
     } catch (IllegalArgumentException e) {
         System.out.println("Invalid signal. Please enter RED, YELLOW, or GREEN.");
     }
     scanner.close();
 }
}
