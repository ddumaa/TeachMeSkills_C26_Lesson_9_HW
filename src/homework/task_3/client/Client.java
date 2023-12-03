package homework.task_3.client;

import homework.task_3.cart.BaseCard;

public class Client{
    public String firstName;
    public String lastName;
    public String passportNumber;
    public String dateOfBirth;
    public BaseCard[] cards;

    public Client(String firstName, String lastName, String passportNumber, String dateOfBirth,
                  int postcode, String country, String city, String street, int houseNumber, int apartmentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.dateOfBirth = dateOfBirth;
        AddressInfo.postcode = postcode;
        AddressInfo.country = country;
        AddressInfo.city = city;
        AddressInfo.street = street;
        AddressInfo.houseNumber = houseNumber;
        AddressInfo.apartmentNumber = apartmentNumber;

    }
}
