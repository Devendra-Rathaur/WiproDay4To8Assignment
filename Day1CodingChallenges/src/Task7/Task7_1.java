package Task7;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Task7_1 {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current Date and Time (default): " + current);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = current.format(formatter);
        System.out.println("Formatted Date and Time: " + formatted);
    }
}
