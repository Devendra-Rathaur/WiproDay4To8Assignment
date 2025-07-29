package Task2;
public class Task2_5 {
    int instanceVar = 10;
    static int staticVar = 20;
    public void display() {
        int localVar = 30;
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }
    public static void main(String[] args) {
        Task2_5 obj = new Task2_5();
        obj.display();
        System.out.println("Accessing Static Variable from main: " + Task2_5.staticVar);
    }
}
