package homework.task_3.client;

public abstract class AddressInfo {
    public int postcode;
    public String country;
    public String city;
    public String street;
    public int houseNumber;
    public int apartmentNumber;

    public AddressInfo(int postcode, String country, String city,
                       String street, int houseNumber, int apartmentNumber) {
        this.postcode = postcode;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }
}
