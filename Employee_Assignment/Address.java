public class Address {
    private  int id;
    private String city;
    private String state;
    private String Country;
    private String Local_Address;

    public Address(int id, String city, String state, String country, String local_Address) {
        this.id = id;
        this.city = city;
        this.state = state;
        Country = country;
        Local_Address = local_Address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getLocal_Address() {
        return Local_Address;
    }

    public void setLocal_Address(String local_Address) {
        Local_Address = local_Address;

    }
    @Override
    public String toString()
    {
        return (city + " - " + state + " - " + Country);
    }
}
