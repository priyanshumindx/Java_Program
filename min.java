public class min {
    public static void main(String[] args) {
        String a = "100";
        String b = "0";

        try {
            // 1. Convert the strings to integers first
            int numA = Integer.parseInt(a);
            int numB = Integer.parseInt(b);

            // 2. Perform the division
            int result = numA / numB;
            System.out.println("Result: " + result);

        } catch (ArithmeticException s) {
            // 3. Catch the division-by-zero error (variable name 's' works perfectly!)
            System.out.println("Err: Cannot divide by zero!");
        }
    }
}
