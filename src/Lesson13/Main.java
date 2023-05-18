package Lesson13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Client client1 = new Client("Петров", 17);
        Client client2 = new Client("Снегирев", 36);
        Client client3 = new Client("Сидоров", 25);

        Account account1 = new Account(client1, 15000);
        Account account2 = new Account(client1, 460000);
        Account account3 = new Account(client2, 681000);
        Account account4 = new Account(client3, 843200);
        Account account5 = new Account(client3, 5050000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);

        List<Account> Accounts = bank.getAccounts(client3);
        System.out.println("Все счета по клиенту:" + client1.getName());
        for (Account account : Accounts) {
            if (account.getClient().getAge() >= 18)
                System.out.println("Золотые монеты: " + account.getCoin());
            else System.out.println("Клиенту нет 18");
        }

        Client accountClient = bank.findClient(account3);
        System.out.println("Найти клиента по счету: " + accountClient.getName());
    }
}