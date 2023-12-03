package homework.task_3.service;

import homework.task_3.client.ClientBase;

public class TransferBetweenCards {
    public static void transferMoney(int idCard_1, int idCard_2, double summaTransfer){
        if (idCard_1 > ClientBase.cardsDavid.length || idCard_2 > ClientBase.cardsDavid.length){
            System.out.println("There is no such card");
        } else if (summaTransfer < 10) {
            System.out.println("The transfer amount is less than the minimum value.");
        } else if (ClientBase.cardsDavid[idCard_1] == ClientBase.cardsDavid[idCard_2]) {
            System.out.println("Translation is not possible");
        } else if (ClientBase.cardsDavid[idCard_1].balance - summaTransfer - (ClientBase.cardsDavid[idCard_1].balance * ClientBase.cardsDavid[idCard_1].commission / 100)  < 0){
            System.out.println("Not enough money");
        } else if (summaTransfer > ClientBase.cardsDavid[idCard_1].limit){
            System.out.println("Transfer is not possible, the transfer amount limit has been exceeded");
        } else if (ClientBase.cardsDavid[idCard_1].currency == ClientBase.cardsDavid[idCard_2].currency){
            ActionsForTransfers.combinedMethod(idCard_1, idCard_2, summaTransfer);
            ClientBase.cardsDavid[idCard_2].balance += summaTransfer;
            ActionsForTransfers.infoBalanceCartAfterT(idCard_2);
        } else if (ClientBase.cardsDavid[idCard_1].currency != ClientBase.cardsDavid[idCard_2].currency){
            ActionsForTransfers.combinedMethod(idCard_1, idCard_2, summaTransfer);
            if (ClientBase.cardsDavid[idCard_1].currency == "BYN" && ClientBase.cardsDavid[idCard_2].currency == "USD"){
                ClientBase.cardsDavid[idCard_2].balance += (summaTransfer / 3.2);
            } else if (ClientBase.cardsDavid[idCard_1].currency == "USD" && ClientBase.cardsDavid[idCard_2].currency == "BYN") {
                ClientBase.cardsDavid[idCard_2].balance += (summaTransfer * 3.2);
            } else if (ClientBase.cardsDavid[idCard_1].currency == "BYN" && ClientBase.cardsDavid[idCard_2].currency == "Euro") {
                ClientBase.cardsDavid[idCard_2].balance += (summaTransfer / 3.5);
            } else if (ClientBase.cardsDavid[idCard_1].currency == "Euro" && ClientBase.cardsDavid[idCard_2].currency == "BYN") {
                ClientBase.cardsDavid[idCard_2].balance += (summaTransfer * 3.5);
            } else if (ClientBase.cardsDavid[idCard_1].currency == "Euro" && ClientBase.cardsDavid[idCard_2].currency == "USD") {
                ClientBase.cardsDavid[idCard_2].balance += (summaTransfer * 1.12);
            } else if (ClientBase.cardsDavid[idCard_1].currency == "USD" && ClientBase.cardsDavid[idCard_2].currency == "Euro") {
                ClientBase.cardsDavid[idCard_2].balance += (summaTransfer * 0.98);
            }
            ActionsForTransfers.infoBalanceCartAfterT(idCard_2);
        }
    }
}
