package Customer;

public class Address {
    private long id;
    private Customer customer;
    private String  addressName;
    private String addressLine1;
    private String addressLine2; //nullable
    private String district;
    private String state; // -> default("Turkey")
    private String province;
    private String zipCode;
}
