package ProductInventorySystem;


import java.sql.*;
import java.util.Scanner;

public class ProductInventorySystem {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/inventory_db";
    private static final String USER = "root";
    private static final String PASSWORD = "sanjith";
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connected to inventory database successfully!");
            
            while (true) {
                System.out.println("\nProduct Inventory System");
                System.out.println("1. Add new product");
                System.out.println("2. View all products");
                System.out.println("3. Update product stock");
                System.out.println("4. Sell product");
                System.out.println("5. Delete product");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (choice) {
                    case 1:
                        addProduct(connection, scanner);
                        break;
                    case 2:
                        viewProducts(connection);
                        break;
                    case 3:
                        updateStock(connection, scanner);
                        break;
                    case 4:
                        sellProduct(connection, scanner);
                        break;
                    case 5:
                        deleteProduct(connection, scanner);
                        break;
                    case 6:
                        System.out.println("Exiting system...");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void addProduct(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("\nAdd New Product");
        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter unit price: ");
        double price = scanner.nextDouble();
        
        String sql = "INSERT INTO products (product_id, product_name, quantity, price) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, quantity);
            pstmt.setDouble(4, price);
            
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " product added successfully!");
        }
    }
    
    private static void viewProducts(Connection connection) throws SQLException {
        System.out.println("\nCurrent Inventory:");
        String sql = "SELECT * FROM products";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            System.out.printf("%-10s %-30s %-10s %-10s %-10s\n", 
                "Product ID", "Product Name", "Quantity", "Price", "Value");
            System.out.println("------------------------------------------------------------------");
            
            while (rs.next()) {
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                double value = quantity * price;
                
                System.out.printf("%-10d %-30s %-10d $%-9.2f $%-9.2f\n",
                    rs.getInt("product_id"),
                    rs.getString("product_name"),
                    quantity,
                    price,
                    value);
            }
        }
    }
    
    private static void updateStock(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("\nUpdate Product Stock");
        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter quantity to add (use negative to remove): ");
        int quantityChange = scanner.nextInt();
        
        String sql = "UPDATE products SET quantity = quantity + ? WHERE product_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, quantityChange);
            pstmt.setInt(2, id);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Stock updated successfully!");
                showCurrentStock(connection, id);
            } else {
                System.out.println("No product found with ID: " + id);
            }
        }
    }
    
    private static void sellProduct(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("\nSell Product");
        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter quantity to sell: ");
        int quantityToSell = scanner.nextInt();
        
        // First check current stock
        int currentStock = getCurrentStock(connection, id);
        if (currentStock == -1) {
            System.out.println("Product not found!");
            return;
        }
        
        if (currentStock < quantityToSell) {
            System.out.println("Insufficient stock! Current stock: " + currentStock);
            return;
        }
        
        String sql = "UPDATE products SET quantity = quantity - ? WHERE product_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, quantityToSell);
            pstmt.setInt(2, id);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                double price = getProductPrice(connection, id);
                double totalValue = quantityToSell * price;
                System.out.printf("Sold %d units of product ID %d for $%.2f\n", 
                    quantityToSell, id, totalValue);
                showCurrentStock(connection, id);
            }
        }
    }
    
    private static void deleteProduct(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("\nDelete Product");
        System.out.print("Enter product ID to delete: ");
        int id = scanner.nextInt();
        
        String sql = "DELETE FROM products WHERE product_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Product deleted successfully!");
            } else {
                System.out.println("No product found with ID: " + id);
            }
        }
    }
    
    private static int getCurrentStock(Connection connection, int productId) throws SQLException {
        String sql = "SELECT quantity FROM products WHERE product_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, productId);
            ResultSet rs = pstmt.executeQuery();
            return rs.next() ? rs.getInt("quantity") : -1;
        }
    }
    
    private static double getProductPrice(Connection connection, int productId) throws SQLException {
        String sql = "SELECT price FROM products WHERE product_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, productId);
            ResultSet rs = pstmt.executeQuery();
            return rs.next() ? rs.getDouble("price") : 0.0;
        }
    }
    
    private static void showCurrentStock(Connection connection, int productId) throws SQLException {
        String sql = "SELECT product_name, quantity FROM products WHERE product_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, productId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.printf("Current stock of %s: %d units\n",
                    rs.getString("product_name"),
                    rs.getInt("quantity"));
            }
        }
    }
}