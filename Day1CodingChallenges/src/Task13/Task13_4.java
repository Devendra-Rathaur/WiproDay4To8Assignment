package Task13;
enum Bike {
 ROYAL_ENFIELD("350cc", 210000),
 KTM_DUKE("250cc", 230000),
 HONDA_HORNET("160cc", 130000),
 YAMAHA_R15("155cc", 180000),
 HERO_SPLENDOR("100cc", 75000);
 private final String engine;
 private final int price;
 Bike(String engine, int price) {
     this.engine = engine;
     this.price = price;
 }
 public String getEngine() {
     return engine;
 }
 public int getPrice() {
     return price;
 }
}
public class Task13_4{
 public static void main(String[] args) {
     System.out.println("Welcome to the Bike Showroom\n");

     for (Bike bike : Bike.values()) {
         System.out.println(bike.name().replace("_", " "));
         System.out.println("  Engine Capacity: " + bike.getEngine());
         System.out.println("  Price: /-" + bike.getPrice() + "\n");
     }
 }
}