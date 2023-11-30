package homework.task_3.service;

import homework.task_3.client.Client;

public abstract class ActionsForTransfers {
    public static void infoClientName(){
        System.out.println(Client.client_1.firstName + " " + Client.client_1.lastName);
    }
    public static void infoClientCartStock(){
        System.out.println("cards in stock: " + Client.cards.length);
    }
    public static void infoBalanceCartBeforeT(int id){
        System.out.println("balance before transfer: " + Client.cards[id].balance);
    }
    public static void infoBalanceCartAfterT(int id){
        System.out.println("balance after transfer: " + Client.cards[id].balance);
    }
    public static void balanceWithdrawal(int id, double sum){
        Client.cards[id].balance -= (sum + (sum * Client.cards[id].commission / 100));
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
