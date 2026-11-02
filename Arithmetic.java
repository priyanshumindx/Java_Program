import java.util.*;
public class Arithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second number: ");
        int b = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");

        int c = sc.nextInt();
        try {
            switch (c) {
                case 1:
                    System.out.println(a + b);
                case 2:
                    System.out.println(a - b);
                case 3:
                    System.out.println(a * b);
                case 4:
                    System.out.println(a / b);
                default:
                    System.out.println("Invalid Input");


            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
            ;
        } finally {
            System.out.println("Program Completed");
        }
    }
}
