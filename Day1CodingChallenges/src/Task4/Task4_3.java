package Task4;

import java.util.Scanner;

public class Task4_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character or symbol: ");
        String symbol = sc.next();

        System.out.print("Enter number of lines: ");
        int lines = sc.nextInt();

        String pattern = ""; 

        for (int i = 1; i <= lines; i++) {
            pattern += symbol; 
            System.out.println(pattern); 
        }

        sc.close();
    }
}
