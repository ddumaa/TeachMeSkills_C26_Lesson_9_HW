package homework.task_3.service;

import homework.task_3.cart.BaseCard;
import homework.task_3.client.Client;

public abstract class ActionsForTransfers {
    public static void infoClientName(Client client_1){
        System.out.println(client_1.firstName + " " + client_1.lastName);
    }
    public static void infoClientCartStock(BaseCard[] cardsDavid){
        System.out.println("cards in stock: " + cardsDavid.length);
    }
    public static void infoBalanceCartBeforeT(BaseCard[] cardsDavid, int id){
        System.out.println("balance before transfer: " + cardsDavid[id].balance);
    }
    public static void infoBalanceCartAfterT(BaseCard[] cardsDavid, int id){
        System.out.println("balance after transfer: " + cardsDavid[id].balance);
    }
    public static void balanceWithdrawal(BaseCard[] cardsDavid, int id, double sum){
        cardsDavid[id].balance -= (sum + (sum * cardsDavid[id].commission / 100));
    }
    public static void combinedMethod (Client client_1, BaseCard[] cardsDavid, int id1, int id2, double sum){
        ActionsForTransfers.infoClientName(client_1);
        ActionsForTransfers.infoClientCartStock(cardsDavid);
        ActionsForTransfers.infoBalanceCartBeforeT(cardsDavid, id1);
        ActionsForTransfers.balanceWithdrawal(cardsDavid, id1, sum);
        ActionsForTransfers.infoBalanceCartAfterT(cardsDavid, id1);
        ActionsForTransfers.infoBalanceCartBeforeT(cardsDavid, id2);
    }
}
