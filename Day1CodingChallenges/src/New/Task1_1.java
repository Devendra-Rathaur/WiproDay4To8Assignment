package New;
public class Task1_1 {
    byte byteVal;
    short shortVal;
    int intVal;
    long longVal;
    float floatVal;
    double doubleVal;
    char charVal;
    boolean booleanVal;
    public void printDefaults() {
        System.out.println("byte:" + byteVal);
        System.out.println("short:" + shortVal);
        System.out.println("int:" + intVal);
        System.out.println("long:" + longVal);
        System.out.println("float:" + floatVal);
        System.out.println("double:" + doubleVal);
        System.out.println("char:'" + charVal + "'");
        System.out.println("boolean:" + booleanVal);
    }
    public static void main(String[] args) {
        Task1_1 pd = new Task1_1();
        pd.printDefaults();
    }
}