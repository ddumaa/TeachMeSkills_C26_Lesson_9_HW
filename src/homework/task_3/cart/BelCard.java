package homework.task_3.cart;

public class BelCard extends BaseCard {
    public static int limit = 3000;
    public  static double commission = 1.5;
    public static String currency = "BYN";

    public BelCard(long cardNumber, int cvv, double balance, long idCart, int limit, double commission, String currency) {
        super(cardNumber, cvv, balance, idCart, limit, commission, currency);
    }
}
