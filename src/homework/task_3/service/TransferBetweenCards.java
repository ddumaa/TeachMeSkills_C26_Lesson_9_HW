package homework.task_3.service;

import homework.task_3.client.ClientBase;

public class TransferBetweenCards {
    public static void transferMoney(int idCard_1, int idCard_2, double summaTransfer){
        if (idCard_1 > ClientBase.cards.length || idCard_2 > ClientBase.cards.length){
            System.out.println("There is no such card");
        } else if (summaTransfer < 10) {
            System.out.println("The transfer amount is less than the minimum value.");
        } else if (ClientBase.cards[idCard_1] == ClientBase.cards[idCard_2]) {
            System.out.println("Translation is not possible");
        } else if (ClientBase.cards[idCard_1].balance - summaTransfer - (ClientBase.cards[idCard_1].balance * ClientBase.cards[idCard_1].commission / 100)  < 0){
            System.out.println("Not enough money");
        } else if (summaTransfer > ClientBase.cards[idCard_1].limit){
            System.out.println("Transfer is not possible, the transfer amount limit has been exceeded");
        } else if (ClientBase.cards[idCard_1].currency == ClientBase.cards[idCard_2].currency){
            ActionsForTransfers.combinedMethod(idCard_1, idCard_2, summaTransfer);
            ClientBase.cards[idCard_2].balance += summaTransfer;
            ActionsForTransfers.infoBalanceCartAfterT(idCard_2);
        } else if (ClientBase.cards[idCard_1].currency != ClientBase.cards[idCard_2].currency){
            ActionsForTransfers.combinedMethod(idCard_1, idCard_2, summaTransfer);
            if (ClientBase.cards[idCard_1].currency == "BYN" && ClientBase.cards[idCard_2].currency == "USD"){
                ClientBase.cards[idCard_2].balance += (summaTransfer / 3.2);
            } else if (ClientBase.cards[idCard_1].currency == "USD" && ClientBase.cards[idCard_2].currency == "BYN") {
                ClientBase.cards[idCard_2].balance += (summaTransfer * 3.2);
            } else if (ClientBase.cards[idCard_1].currency == "BYN" && ClientBase.cards[idCard_2].currency == "Euro") {
                ClientBase.cards[idCard_2].balance += (summaTransfer / 3.5);
            } else if (ClientBase.cards[idCard_1].currency == "Euro" && ClientBase.cards[idCard_2].currency == "BYN") {
                ClientBase.cards[idCard_2].balance += (summaTransfer * 3.5);
            } else if (ClientBase.cards[idCard_1].currency == "Euro" && ClientBase.cards[idCard_2].currency == "USD") {
                ClientBase.cards[idCard_2].balance += (summaTransfer * 1.12);
            } else if (ClientBase.cards[idCard_1].currency == "USD" && ClientBase.cards[idCard_2].currency == "Euro") {
                ClientBase.cards[idCard_2].balance += (summaTransfer * 0.98);
            }
            ActionsForTransfers.infoBalanceCartAfterT(idCard_2);
        }
    }
}
