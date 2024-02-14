public class Order {
    private String orderName;
    private String orderDate;
    private Float orderPrice;
    private Customer customer;
    private String deliveryAddress;
    private String paymentMode;

    public Order(String orderName, String orderDate, Float orderPrice, Customer customer, String deliveryAddress, String paymentMode) {
        this.orderName = orderName;
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
        this.customer = customer;
        this.deliveryAddress = deliveryAddress;
        this.paymentMode = paymentMode;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}
