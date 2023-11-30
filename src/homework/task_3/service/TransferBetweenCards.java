package homework.task_3.service;

import homework.task_3.client.Client;

public class TransferBetweenCards {
    public static void transferMoney(int idCard_1, int idCard_2, double summaTransfer){
        if (idCard_1 > Client.carts.length || idCard_2 > Client.carts.length){
            System.out.println("There is no such card");
        } else if (Client.carts[idCard_1] == Client.carts[idCard_2]) {
            System.out.println("Translation is not possible");
        } else if (Client.carts[idCard_1].balance - summaTransfer - (Client.carts[idCard_1].balance * Client.carts[idCard_1].commission / 100)  < 0){
            System.out.println("Not enough money");
        } else if (summaTransfer > Client.carts[idCard_1].limit){
            System.out.println("Transfer is not possible, the transfer amount limit has been exceeded");
        } else {
            System.out.println(Client.client_1.firstName + " " + Client.client_1.lastName);
            System.out.println("cards in stock: " + Client.carts.length);
            System.out.println("balance before transfer: " + Client.carts[idCard_1].balance);
            Client.carts[idCard_1].balance -= summaTransfer - (Client.carts[idCard_1].balance * Client.carts[idCard_1].commission / 100);
            System.out.println("balance after transfer: " + Client.carts[idCard_1].balance);
            System.out.println("balance before transfer: " + Client.carts[idCard_2].balance);
            Client.carts[idCard_2].balance += summaTransfer;
            System.out.println("balance after transfer: " + Client.carts[idCard_2].balance);
        }
    }
}
