package homework.task_3.client;

import homework.task_3.cart.BaseCart;
import homework.task_3.cart.BelCard;
import homework.task_3.cart.MasterCard;
import homework.task_3.cart.VisaCard;

public class Client extends AddressInfo {
    public String firstName;
    public String lastName;
    public String passportNumber;
    public String dateOfBirth;

    public Client(String firstName, String lastName, String passportNumber, String dateOfBirth,
                  int postcode, String country, String city, String street, int houseNumber, int apartmentNumber) {
        super(postcode, country, city, street, houseNumber, apartmentNumber);
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.dateOfBirth = dateOfBirth;
    }
    public static Client client_1 = new Client("David", "Metrovaj", "4856BB78",
            "12.6.2001", 10087, "Belgium", "Brugge",
            "Oliebaan", 45, 1);
    static BaseCart belCart1Client_1 = new BelCard(1085_1504_0000_1587l, 445, 3789.65, 0, BelCard.limit, BelCard.commission, BelCard.currency);
    static BaseCart belCart2Client_1 = new BelCard(1246_0780_0000_1474l, 702, 0.04, 1, BelCard.limit, BelCard.commission, BelCard.currency);
    static BaseCart visaCard1Client_1 = new VisaCard(1789_7933_0011_1452l, 214, 623.12, 2, VisaCard.limit, VisaCard.commission, VisaCard.currency);
    static BaseCart visaCard2Client_1 = new VisaCard(2236_5202_4111_3412l, 614, 1102.00, 3, VisaCard.limit, VisaCard.commission, VisaCard.currency);
    static BaseCart masterCard1Client_1 = new MasterCard(3214_7851_0000_4158l, 178, 102.3, 4, MasterCard.limit, MasterCard.commission, MasterCard.currency);
    static BaseCart masterCard2Client_1 = new MasterCard(3408_1483_0000_3491l, 324, 505, 5, MasterCard.limit, MasterCard.commission, MasterCard.currency);

    public static BaseCart[] carts = new BaseCart[]{belCart1Client_1, belCart2Client_1, visaCard1Client_1, visaCard2Client_1,
            masterCard1Client_1, masterCard2Client_1};
}
