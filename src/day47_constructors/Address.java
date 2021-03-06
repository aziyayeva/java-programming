package day47_constructors;

public class Address {
    //encapsulations - hiding data and creating
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";

    //constructor - automatically called
    //no return type
    //save the same as
    public Address() {
        System.out.println("Address constructor");
        street = "123 Main Street";
        city = "Owings Mills";
        state = "MD";
        zipCode = "21145";
    }
    public Address(String street, String city, String state, String zipCode){
        if (street.isEmpty() || street.length() > 50) {
            System.out.println("ERROR: Invalid Street");
        } else {
            this.street = street;
            this.zipCode = zipCode;
            this.city = city;
            this.state = state;
        }

    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
