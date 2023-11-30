package homework.task_3.cart;

public abstract class BaseCart {
    public  long cardNumber;
    public  int cvv;
    public  double balance;
    public  long idCart;
    public  int limit;
    public  double commission;

    public BaseCart(long cardNumber, int cvv, double balance, long idCart, int limit, double commission) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.balance = balance;
        this.idCart = idCart;
        this.limit = limit;
        this.commission = commission;
    }
}
