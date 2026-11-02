import java.util.*;
public class Assignment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number a:");
        int a = sc.nextInt();

        System.out.print("Enter number b:");
        int b = sc.nextInt();

        try{
            int r = a/b;
            System.out.print("Result: " +r);
        }

        catch (ArithmeticException e){
            System.out.println("Divion by zero not possible");
        }
    }
}
