package homework.task_3.service;

import homework.task_3.cart.BaseCard;
import homework.task_3.client.Client;
import homework.task_3.client.ClientBase;

public class TransferBetweenCards {
    public static void transferMoney(Client client_1, BaseCard[] cardsDavid, int idCard_1, int idCard_2, double summaTransfer){
        if (idCard_1 > cardsDavid.length || idCard_2 > cardsDavid.length){
            System.out.println("There is no such card");
        } else if (summaTransfer < 10) {
            System.out.println("The transfer amount is less than the minimum value.");
        } else if (cardsDavid[idCard_1] == cardsDavid[idCard_2]) {
            System.out.println("Translation is not possible");
        } else if (cardsDavid[idCard_1].balance - summaTransfer - (cardsDavid[idCard_1].balance * cardsDavid[idCard_1].commission / 100)  < 0){
            System.out.println("Not enough money");
        } else if (summaTransfer > cardsDavid[idCard_1].limit){
            System.out.println("Transfer is not possible, the transfer amount limit has been exceeded");
        } else if (cardsDavid[idCard_1].currency == cardsDavid[idCard_2].currency){
            ActionsForTransfers.combinedMethod(client_1, cardsDavid, idCard_1, idCard_2, summaTransfer);
            cardsDavid[idCard_2].balance += summaTransfer;
            ActionsForTransfers.infoBalanceCartAfterT(cardsDavid, idCard_2);
        } else if (cardsDavid[idCard_1].currency != cardsDavid[idCard_2].currency){
            ActionsForTransfers.combinedMethod(client_1, cardsDavid, idCard_1, idCard_2, summaTransfer);
            if (cardsDavid[idCard_1].currency == "BYN" && cardsDavid[idCard_2].currency == "USD"){
                cardsDavid[idCard_2].balance += (summaTransfer / 3.2);
            } else if (cardsDavid[idCard_1].currency == "USD" && cardsDavid[idCard_2].currency == "BYN") {
                cardsDavid[idCard_2].balance += (summaTransfer * 3.2);
            } else if (cardsDavid[idCard_1].currency == "BYN" && cardsDavid[idCard_2].currency == "Euro") {
                cardsDavid[idCard_2].balance += (summaTransfer / 3.5);
            } else if (cardsDavid[idCard_1].currency == "Euro" && cardsDavid[idCard_2].currency == "BYN") {
                cardsDavid[idCard_2].balance += (summaTransfer * 3.5);
            } else if (cardsDavid[idCard_1].currency == "Euro" && cardsDavid[idCard_2].currency == "USD") {
                cardsDavid[idCard_2].balance += (summaTransfer * 1.12);
            } else if (cardsDavid[idCard_1].currency == "USD" && cardsDavid[idCard_2].currency == "Euro") {
                cardsDavid[idCard_2].balance += (summaTransfer * 0.98);
            }
            ActionsForTransfers.infoBalanceCartAfterT(cardsDavid, idCard_2);
        }
    }
}
