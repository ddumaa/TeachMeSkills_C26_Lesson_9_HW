package homework.task_3.service;

import homework.task_3.client.ClientBase;

public abstract class ActionsForTransfers {
    public static void infoClientName(){
        System.out.println(ClientBase.client_1.firstName + " " + ClientBase.client_1.lastName);
    }
    public static void infoClientCartStock(){
        System.out.println("cards in stock: " + ClientBase.cards.length);
    }
    public static void infoBalanceCartBeforeT(int id){
        System.out.println("balance before transfer: " + ClientBase.cards[id].balance);
    }
    public static void infoBalanceCartAfterT(int id){
        System.out.println("balance after transfer: " + ClientBase.cards[id].balance);
    }
    public static void balanceWithdrawal(int id, double sum){
        ClientBase.cards[id].balance -= (sum + (sum * ClientBase.cards[id].commission / 100));
    }
    public static void combinedMethod (int id1, int id2, double sum){
        ActionsForTransfers.infoClientName();
        ActionsForTransfers.infoClientCartStock();
        ActionsForTransfers.infoBalanceCartBeforeT(id1);
        ActionsForTransfers.balanceWithdrawal(id1, sum);
        ActionsForTransfers.infoBalanceCartAfterT(id1);
        ActionsForTransfers.infoBalanceCartBeforeT(id2);
    }
}
