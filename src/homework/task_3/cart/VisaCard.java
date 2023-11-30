package homework.task_3.cart;

public class VisaCard extends BaseCart {
    public static int limit = 1000;
    public static double commission = 1;

    public VisaCard(long cardNumber, int cvv, double balance, long idCart, int limit, double commission) {
        super(cardNumber, cvv, balance, idCart, limit, commission);
    }
}
