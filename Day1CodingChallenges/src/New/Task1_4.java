package New;
public class Task1_4 {
    public static void main(String[] args) {
        int num1 = 12;
        byte num2 = 5;
        int andResult = num1&num2;
        int orResult = num1|num2;
        int xorResult = num1^num2;
        System.out.println("num1:" + num1 + " (" + Integer.toBinaryString(num1) + ")");
        System.out.println("num2:" + num2 + " (" + Integer.toBinaryString(num2) + ")");
        System.out.println("AND: " + andResult + " (" + Integer.toBinaryString(andResult) + ")");
        System.out.println("OR: " + orResult + " (" + Integer.toBinaryString(orResult) + ")");
        System.out.println("XOR: " + xorResult + " (" + Integer.toBinaryString(xorResult) + ")");
    }
}
