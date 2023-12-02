package homework.task_3.service;

import homework.task_3.client.Client;

public class TransferBetweenCards {
    public static void transferMoney(int idCard_1, int idCard_2, double summaTransfer){
        if (idCard_1 > Client.cards.length || idCard_2 > Client.cards.length){
            System.out.println("There is no such card");
        } else if (summaTransfer < 10) {
            System.out.println("The transfer amount is less than the minimum value.");
        } else if (Client.cards[idCard_1] == Client.cards[idCard_2]) {
            System.out.println("Translation is not possible");
        } else if (Client.cards[idCard_1].balance - summaTransfer - (Client.cards[idCard_1].balance * Client.cards[idCard_1].commission / 100)  < 0){
            System.out.println("Not enough money");
        } else if (summaTransfer > Client.cards[idCard_1].limit){
            System.out.println("Transfer is not possible, the transfer amount limit has been exceeded");
        } else if (Client.cards[idCard_1].currency == Client.cards[idCard_2].currency){
            ActionsForTransfers.combinedMethod(idCard_1, idCard_2, summaTransfer);
            Client.cards[idCard_2].balance += summaTransfer;
            ActionsForTransfers.infoBalanceCartAfterT(idCard_2);
        } else if (Client.cards[idCard_1].currency != Client.cards[idCard_2].currency){
            ActionsForTransfers.combinedMethod(idCard_1, idCard_2, summaTransfer);
            if (Client.cards[idCard_1].currency == "BYN" && Client.cards[idCard_2].currency == "USD"){
                Client.cards[idCard_2].balance += (summaTransfer / 3.2);
            } else if (Client.cards[idCard_1].currency == "USD" && Client.cards[idCard_2].currency == "BYN") {
                Client.cards[idCard_2].balance += (summaTransfer * 3.2);
            } else if (Client.cards[idCard_1].currency == "BYN" && Client.cards[idCard_2].currency == "Euro") {
                Client.cards[idCard_2].balance += (summaTransfer / 3.5);
            } else if (Client.cards[idCard_1].currency == "Euro" && Client.cards[idCard_2].currency == "BYN") {
                Client.cards[idCard_2].balance += (summaTransfer * 3.5);
            } else if (Client.cards[idCard_1].currency == "Euro" && Client.cards[idCard_2].currency == "USD") {
                Client.cards[idCard_2].balance += (summaTransfer * 1.12);
            } else if (Client.cards[idCard_1].currency == "USD" && Client.cards[idCard_2].currency == "Euro") {
                Client.cards[idCard_2].balance += (summaTransfer * 0.98);
            }
            ActionsForTransfers.infoBalanceCartAfterT(idCard_2);
        }
    }
}
