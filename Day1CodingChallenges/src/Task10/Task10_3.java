package Task10;
import java.util.Scanner;
public class Task10_3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    	        System.out.println("------Welcome to Java Cafe--------");
    	        System.out.println("Menu:");
    	        System.out.println("1.Burger-120/-");
    	        System.out.println("2.Pizza -250/-");
    	        System.out.println("3.Sandwich-90/-");
    	        System.out.println("4.Coffee-60/-");
    	        System.out.println("5.Exit");
    	        System.out.print("Please enter your choice (1-5):");
    	        int choice = scanner.nextInt();
    	        switch (choice) {
    	            case 1:
    	                System.out.println("You ordered a Burger. Price:120/-");
    	                break;
    	            case 2:
    	                System.out.println("You ordered a Pizza. Price: 250/-");
    	                break;
    	            case 3:
    	                System.out.println("You ordered a Sandwich. Price:90/-");
    	                break;
    	            case 4:
    	                System.out.println("You ordered a Coffee. Price:60/-");
    	                break;
    	            case 5:
    	                System.out.println("Thank you! Visit again.");
    	                break;
    	            default:
    	                System.out.println("Invalid choice.Please choose between 1 and 5.");
    	        }
    	        scanner.close();
    	    }
    	}
