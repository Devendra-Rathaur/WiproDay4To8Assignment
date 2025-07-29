package Task4;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter your address: ");
        String address = sc.nextLine();
        String userDetails = "Name: " + name + ", Age: " + age + ", Address: " + address;
        System.out.println("User Info: " + userDetails);
        sc.close();
    }
}
