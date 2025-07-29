package Task13;
enum Biryani {
 HYDERABADI,
 LUCKNOWI,
 KOLKATA,
 MALABAR,
 SINDHI,
 AMBURSPECIAL
}
public class Task13_3 {
 public static void main(String[] args) {
     System.out.println("Welcome to Biryani House!");
     System.out.println("Here are the types of Biryani available:\n");
     for (Biryani item : Biryani.values()) {
         System.out.println("- " + formatName(item));
     }
 }
 private static String formatName(Biryani biryani) {
     String name = biryani.name().toLowerCase().replace('_', ' ');
     return Character.toUpperCase(name.charAt(0)) + name.substring(1) + " Biryani";
 }
}
