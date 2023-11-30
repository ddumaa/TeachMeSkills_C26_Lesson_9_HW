package homework.task_3.cart;

public class MasterCard extends BaseCard {
    public static int limit = 1000;
    public static double commission = 2;
    public static String currency = "USD";

    public MasterCard(long cardNumber, int cvv, double balance, long idCart, int limit, double commission, String currency) {
        super(cardNumber, cvv, balance, idCart, limit, commission, currency);
    }
}
