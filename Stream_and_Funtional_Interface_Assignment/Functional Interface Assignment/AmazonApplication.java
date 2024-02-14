import java.util.List;
import java.util.ArrayList;

public class AmazonApplication{

    

    public static void main(String[] args) {

    AmazonShopping upiPaymentProcessing = () -> System.out.println("Pay with UPI");
    AmazonShopping cardPaymentProcessing = () -> System.out.println("Pay with any card");
    AmazonShopping cashPaymentProcessing = () -> System.out.println("Pay on delivery");
    
        List<Order> cart = new ArrayList<Order>();
        Customer nitin = new Customer("Nitin","Male",23,9368913299l);
        
        Order order1 = new Order("iqoo 12pro", "12-01-2024", 56000f, nitin, "secret", "COD");
        Order order2 = new Order("Samsung Galaxy S22", "13-01-2024", 80000f, nitin, "confidential", "COD");
        Order order3 = new Order("Apple MacBook Pro", "14-01-2024", 120000f, nitin, "unknown", "COD");
        
        AmazonShopping.addToCart(order1, cart);
        AmazonShopping.addToCart(order2, cart);
        AmazonShopping.addToCart(order3, cart);
        AmazonShopping.printOrderDetails(cart);
        cashPaymentProcessing.paymentProcessing();
        AmazonShopping.generateInvoice(cart);
        AmazonShopping.dispatchOrder(cart);
    }
}
