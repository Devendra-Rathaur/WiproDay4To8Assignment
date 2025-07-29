package OnlineCourseRegistrationSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CourseRegistrationSystem {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/course_db";
	private static final String USER = "root";
	private static final String PASSWORD = "sanjith";

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");

			Connection con = DriverManager.getConnection(DB_URL,USER, PASSWORD);
			System.out.println("Connection established");

			while(true) {
				System.out.println("\nCourse Registration System");
				System.out.println("1. Add new course");
				System.out.println("2. View all courses");
				System.out.println("3. Update course details");
				System.out.println("4. Delete course");
				System.out.println("5. Exit");
				System.out.print("Enter your choice: ");
				
				int choice = sc.nextInt();
				sc.nextLine();
				
				switch(choice) {
				 case 1:
                     addCourse(con, sc);
                     break;
                 case 2:
                     viewCourses(con);
                     break;
                 case 3:
                     updateCourse(con, sc);
                     break;
                 case 4:
                     deleteCourse(con, sc);
                     break;
                 case 5:
                     System.out.println("Exiting system...");
                     return;
                 default:
                     System.out.println("Invalid choice!");
              }
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void addCourse(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("\nAdd New Course");
        System.out.print("Enter course ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter course name: ");
        String name = scanner.nextLine();
        System.out.print("Enter faculty name: ");
        String faculty = scanner.nextLine();
        System.out.print("Enter credits: ");
        int credits = scanner.nextInt();
        
        String sql = "INSERT INTO courses (course_id, course_name, faculty, credits) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, faculty);
            pstmt.setInt(4, credits);
            
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " course added successfully!");
        }
    }

	
	 private static void viewCourses(Connection connection) throws SQLException {
	        System.out.println("\nAvailable Courses:");
	        String sql = "SELECT * FROM courses";
	        try (Statement stmt = connection.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
	            
	            System.out.printf("%-10s %-30s %-20s %-10s\n", 
	                "Course ID", "Course Name", "Faculty", "Credits");
	            System.out.println("------------------------------------------------------------");
	            
	            while (rs.next()) {
	                System.out.printf("%-10d %-30s %-20s %-10d\n",
	                    rs.getInt("course_id"),
	                    rs.getString("course_name"),
	                    rs.getString("faculty"),
	                    rs.getInt("credits"));
	            }
	        }
	    }
	 
	 
	 
	 private static void updateCourse(Connection connection, Scanner scanner) throws SQLException {
	        System.out.println("\nUpdate Course Details");
	        System.out.print("Enter course ID to update: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        
	        System.out.print("Enter new faculty name (leave blank to keep current): ");
	        String faculty = scanner.nextLine();
	        System.out.print("Enter new credits (enter 0 to keep current): ");
	        int credits = scanner.nextInt();
	        
	        String sql = "UPDATE courses SET faculty = COALESCE(?, faculty), credits = ? WHERE course_id = ?";
	        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
	            pstmt.setString(1, faculty.isEmpty() ? null : faculty);
	            pstmt.setInt(2, credits == 0 ? 
	                getCurrentCredits(connection, id) : credits);
	            pstmt.setInt(3, id);
	            
	            int rowsAffected = pstmt.executeUpdate();
	            if (rowsAffected > 0) {
	                System.out.println("Course updated successfully!");
	            } else {
	                System.out.println("No course found with ID: " + id);
	            }
	        }
	    }
	 
	 private static int getCurrentCredits(Connection connection, int courseId) throws SQLException {
	        String sql = "SELECT credits FROM courses WHERE course_id = ?";
	        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
	            pstmt.setInt(1, courseId);
	            ResultSet rs = pstmt.executeQuery();
	            return rs.next() ? rs.getInt("credits") : 0;
	        }
	    }
	 
	 
	 
	 
	 private static void deleteCourse(Connection connection, Scanner scanner) throws SQLException {
	        System.out.println("\nDelete Course");
	        System.out.print("Enter course ID to delete: ");
	        int id = scanner.nextInt();
	        
	        String sql = "DELETE FROM courses WHERE course_id = ?";
	        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
	            pstmt.setInt(1, id);
	            
	            int rowsAffected = pstmt.executeUpdate();
	            if (rowsAffected > 0) {
	                System.out.println("Course deleted successfully!");
	            } else {
	                System.out.println("No course found with ID: " + id);
	            }
	        }
	    }
}
