import java.util.Random;
import java.util.Scanner;

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}

class ShoppingCheckout {
    static void checkout(double price, int stock) {
        boolean gatewayConnected = false;
        try {
            System.out.println("Starting Checkout.");

            if (price < 0) {
                throw new IllegalArgumentException("Product price cannot be negative.");
            }
            if (stock <= 0) {
                throw new OutOfStockException("Product is out of stock.");
            }

            System.out.println("Connecting payment gateway.");
            gatewayConnected = true;

            Random random = new Random();
            boolean paymentSuccess = random.nextBoolean();

            if (!paymentSuccess) {
                throw new PaymentFailedException("Payment Transaction Failed.");
            }

            System.out.println("Payment Successful.");
            System.out.println("Order placed Successfully!");
            return; // Exit early so the failure message at the bottom doesn't run

        } catch (IllegalArgumentException e) {
            System.err.println("[VALIDATION ERROR] " + e.getMessage());
        } catch (OutOfStockException e) {
            System.err.println("[STOCK ERROR] " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.err.println("[PAYMENT ERROR] " + e.getMessage());
        } finally {
            if (gatewayConnected) {
                System.out.println("Closing Payment Gateway Connection.");
            }
            gatewayConnected = false;
        }

        System.out.println("Checkout Process Failed.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price:");
        double p = sc.nextDouble(); // Changed to double to match method signature

        System.out.println("Enter the stock:");
        int s = sc.nextInt(); // Fixed variable name collision

        checkout(p, s); // Passed user inputs instead of hardcoded values
        sc.close();
    }
}
