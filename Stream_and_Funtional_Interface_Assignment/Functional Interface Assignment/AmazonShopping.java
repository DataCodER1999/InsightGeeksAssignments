import java.util.List;

@FunctionalInterface
public interface AmazonShopping{
    
    public static boolean addToCart(Order order, List<Order> cart)
    {
        try{
            cart.add(order);
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    } 

    void paymentProcessing();

    public static void printOrderDetails(List<Order> cart)
    {
        int i=1;
        System.out.println("***************************************************");
        System.out.println("ORDER SUMMARY");
        for (Order order : cart) {
            System.out.println("Order no : "+i);
            System.out.println("Order Name : "+order.getOrderName());
            System.out.println("Order Price"+order.getOrderPrice());
            System.out.println("Order Date : "+order.getOrderDate());
            System.err.println("Payment Mode : "+order.getPaymentMode());
            System.out.println("Delivery Address"+order.getDeliveryAddress());
            System.out.println("**************************************************");
        }

        double total = cart.stream().mapToDouble(order -> order.getOrderPrice()).sum();
        System.out.println("Total Amount : "+total);

        System.out.println("\n\n");
    }

    public static void dispatchOrder(List<Order> cart)
    {
        System.out.println("\n\n");
        if(cart.size() > 0)
        {
        System.out.println("Order dispatched successfully");
        }
        else{
            System.out.println("your cart is empty");
        }
    }

    public static void generateInvoice(List<Order> cart) {
        
        System.out.println("\n\n");
        System.out.println("********************************************");
        System.out.println("************ Amazon Invoice ****************");
        System.out.println("********************************************");

        double totalAmount = 0.0;

        for (Order order : cart) {
            Customer customer = order.getCustomer();
            System.out.println("Customer Name: " + customer.getCustomerName());
            System.out.println("Order Name: " + order.getOrderName());
            System.out.println("Order Date: " + order.getOrderDate());
            System.out.println("Order Price: Rs."+order.getOrderPrice());
            System.out.println("Delivery Address: " + order.getDeliveryAddress());
            System.out.println("Payment Mode: " + order.getPaymentMode());

            System.out.println("--------------------------------------------");
                totalAmount += order.getOrderPrice();
            
            }
            System.out.println("--------------------------------------------");
            System.out.printf("Total Amount for Order: Rs.%.2f%n", totalAmount);
            System.out.println("--------------------------------------------");

    }

}