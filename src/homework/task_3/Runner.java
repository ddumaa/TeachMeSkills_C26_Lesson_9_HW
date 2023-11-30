package homework.task_3;

import homework.task_3.service.TransferBetweenCards;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID of the card from which you want to transfer money");
        int idCard_1 = scanner.nextInt();
        System.out.println("Enter the ID of the card you want to transfer money to");
        int idCard_2 = scanner.nextInt();
        System.out.println("Enter the transfer amount");
        double summaTransfer = scanner.nextInt();
        TransferBetweenCards.transferMoney(idCard_1, idCard_2, summaTransfer);
    }
}
