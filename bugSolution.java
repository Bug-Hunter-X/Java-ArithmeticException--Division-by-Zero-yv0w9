public class MyClass {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = 0;
        try {
            z = x / y; 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } finally {
            System.out.println("Result: " + z);
        }
    }
}