package homework.task_3.client;

import homework.task_3.cart.BaseCard;

public class Client{
    public String firstName;
    public String lastName;
    public String passportNumber;
    public String dateOfBirth;
    public AddressInfo[] address;
    public  BaseCard[] cards;

    public Client(String firstName, String lastName, String passportNumber, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.dateOfBirth = dateOfBirth;
    }
}
