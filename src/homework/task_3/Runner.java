package homework.task_3;

import homework.task_3.cart.BaseCard;
import homework.task_3.cart.BelCard;
import homework.task_3.cart.MasterCard;
import homework.task_3.cart.VisaCard;
import homework.task_3.client.AddressInfo;
import homework.task_3.client.Client;
import homework.task_3.service.TransferBetweenCards;

import java.util.Scanner;

/**
 * Создайте программу для перевода с одной банковской карты клиента на его другую карту.
 * Данные для перевода задаются с консоли.
 * Есть клиент.
 * В системе храниться информация о имени, фамилии, номере паспорта, дате рождения клинета.
 * А так же его почтовый индекс, страна, город, улица и номер дома.
 * У клиента может быть банковская карта (одна или более).
 * Сделать метод для перевода суммы с одной краты на другую.
 * Каждая карта содержит номер карты, CVC/CVV, текущую сумму на карте, код(id) карты.
 * Карты могут быть трех видов: BelCard, MasterCard, VisaCard.
 * Для переводов существуют лимиты. Лимиты проверяются только для карты с которой делается перевод.
 * Для каждого типа карты существуют свои лимиты.
 * Карты могут быть в разной валюте - следовательно, предусмотреть конвертацию.
 * За перевод снимается коммисия (задается в процентах).
 * Предусмотреть различные проверки и валидации.
 */
public class Runner {
    public static void main(String[] args) {
        Client client_1 = new Client("David", "Metrovaj", "4856BB78",
                "12.6.2001");
        AddressInfo addressInfo = new AddressInfo();
        addressInfo.city = "Oslo";
        addressInfo.country = "Norge";
        addressInfo.postcode = 13000;
        client_1.address = new AddressInfo[]{addressInfo};


        BaseCard belCart1Client_1 = new BelCard(1085_1504_0000_1587L, 445, 3789.65, 0, BelCard.limit, BelCard.commission, BelCard.currency);
        BaseCard belCart2Client_1 = new BelCard(1246_0780_0000_1474L, 702, 0.04, 1, BelCard.limit, BelCard.commission, BelCard.currency);
        BaseCard visaCard1Client_1 = new VisaCard(1789_7933_0011_1452L, 214, 623.12, 2, VisaCard.limit, VisaCard.commission, VisaCard.currency);
        BaseCard visaCard2Client_1 = new VisaCard(2236_5202_4111_3412L, 614, 1102.00, 3, VisaCard.limit, VisaCard.commission, VisaCard.currency);
        BaseCard masterCard1Client_1 = new MasterCard(3214_7851_0000_4158L, 178, 102.3, 4, MasterCard.limit, MasterCard.commission, MasterCard.currency);
        BaseCard masterCard2Client_1 = new MasterCard(3408_1483_0000_3491L, 324, 505, 5, MasterCard.limit, MasterCard.commission, MasterCard.currency);
        client_1.cards = new BaseCard[]{belCart1Client_1, belCart2Client_1, visaCard1Client_1, visaCard2Client_1, masterCard1Client_1, masterCard2Client_1};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID of the card from which you want to transfer money");
        int idCard_1 = scanner.nextInt();
        System.out.println("Enter the ID of the card you want to transfer money to");
        int idCard_2 = scanner.nextInt();
        System.out.println("Enter the transfer amount");
        double summaTransfer = scanner.nextInt();
        TransferBetweenCards.transferMoney(client_1, client_1.cards, idCard_1, idCard_2, summaTransfer);
    }
}
