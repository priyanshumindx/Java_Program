class Pizza{
    String name;
    String size;
    double price;

    Pizza(String name, String size, double price){
        this.name = name;
        this.size = size;
        setPrice(price);
    }

    public void setPrice(double price){
        if(price >= 0){
            this.price = price;
        } else{
            System.out.println("Invalid Price");
        }
    }

    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }

    public String getSize(){
        return size;
    }

    void displayDetails(){
        System.out.println("Pizza: " +name);
        System.out.println("Size: " +size);
        System.out.println("Price: " +price);
    }
}

class SpecialPizza extends Pizza{

    private double extraCheesePizza;

    SpecialPizza(String name, String size, double price, double extraCheesePrice){
        super(name,size,price);
        this.extraCheesePizza=extraCheesePrice;
    }

    public double calculateTotalPrice(){
        return getPrice() + extraCheesePizza;
    }
}
interface Payable{
    void pay(double amount);
}
class UpiPayment implements Payable{

    public void pay(double amount){
        System.out.println("Paid using UPI: " +amount);
    }
}


class CardPayment implements Payable{

    @Override
    public void pay(double amount) {
        System.out.println("Paid using Card: " +amount);
    }
}
public class PizzaOrderingSystem {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("Margherita", "Medium", 250);

        Pizza pizza2 = new Pizza("Farmhouse", "Large", 450);

        pizza1.displayDetails();

        System.out.println();

        pizza2.displayDetails();

        System.out.println();

        SpecialPizza special = new SpecialPizza("Cheese Burst", "Large", 400, 100);

        System.out.println(special.getName());
        System.out.println(special.calculateTotalPrice());

        Payable payment = new UpiPayment();
        payment.pay(500);

        payment = new CardPayment();
        payment.pay(500);

    }
}
