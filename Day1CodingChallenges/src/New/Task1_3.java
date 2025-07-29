package New;
public class Task1_3 {
    public static void main(String[] args) {
        double doubleVal = 123.456;
        float floatVal = 98.76f;
        int intVal = (int) doubleVal;
        byte byteVal = (byte) floatVal; 
        System.out.println("Original double: " + doubleVal);
        System.out.println("Converted to int: " + intVal);
        System.out.println("Original float: " + floatVal);
        System.out.println("Converted to byte: " + byteVal);
    }
}
