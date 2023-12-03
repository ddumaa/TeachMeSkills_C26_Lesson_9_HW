package homework.task_3;

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
