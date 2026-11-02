import java.util.*;

public class Assignment3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        String a = sc.nextLine();

        try {
            // Convert the string to an integer
            int c = Integer.parseInt(a);

            // Divide 100 by the entered number
            int result = 100 / c;
            System.out.println("Result (100 / " + c + "): " + result);

        } catch (NumberFormatException e) {
            // Handles invalid text inputs like letters, symbols, or empty spaces
            System.out.println("Error: Invalid text entered. Please enter a valid integer.");

        } catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Error: Cannot divide by zero.");
        }

        sc.close();
    }
}
