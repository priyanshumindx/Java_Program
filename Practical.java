
import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String description;
    String category;
    double amount;

    Expense(String description, String category, double amount) {
        this.description = description;
        this.category = category;
        this.amount = amount;
    }

    void displayExpense() {
        System.out.println(description + " | " + category + " | Rs. " + amount);
    }
}

public class Practical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();

        System.out.print("How many expenses do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        if (n < 0) {
            System.out.println("Number of expenses cannot be negative.");
            sc.close();
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nExpense " + (i + 1));

            System.out.print("Description: ");
            String description = sc.nextLine();

            System.out.print("Category: ");
            String category = sc.nextLine();

            System.out.print("Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            if (amount <= 0) {
                System.out.println("Amount must be positive.");
                i--;
                continue;
            }

            Expense e = new Expense(description, category, amount);
            expenses.add(e);
        }

        System.out.println("\n--- All Expenses ---");

        double total = 0;

        for (Expense e : expenses) {
            e.displayExpense();
            total += e.amount;
        }

        System.out.println("Total spending: Rs. " + total);
        sc.close();
    }
}
