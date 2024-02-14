public class Customer {
    private String customerName;
    private String customerGender;
    private int customerAge;
    private long customerPhoneNumber;

    public Customer() {
        
    }

    public Customer(String customerName, String customerGender, int customerAge, long customerPhoneNumber) {
        this.customerName = customerName;
        this.customerGender = customerGender;
        this.customerAge = customerAge;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public long getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
