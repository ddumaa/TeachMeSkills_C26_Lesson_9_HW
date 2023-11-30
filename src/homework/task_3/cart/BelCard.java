package homework.task_3.cart;

public class BelCard extends BaseCart {
    public static int limit = 3000;
    public  static double commission = 1.5;

    public BelCard(long cardNumber, int cvv, double balance, long idCart, int limit, double commission) {
        super(cardNumber, cvv, balance, idCart, limit, commission);
    }
}
