package Task13;
enum TrafficLight {
 RED("Stop", 60),
 YELLOW("Get Ready", 5),
 GREEN("Go", 45);
 private final String action;
 private final int duration;
 TrafficLight(String action, int duration) {
     this.action = action;
     this.duration = duration;
 }
 public String getAction() {
     return action;
 }
 public int getDuration() {
     return duration;
 }
}
public class Task13_5{
 public static void main(String[] args) {
     System.out.println("Traffic Light States:\n");
     for (TrafficLight signal : TrafficLight.values()) {
         System.out.println(signal.name());
         System.out.println("  Action: " + signal.getAction());
         System.out.println("  Duration: " + signal.getDuration() + " seconds\n");
     }
 }
}
