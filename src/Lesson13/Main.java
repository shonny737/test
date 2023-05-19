package Lesson13;

public class Main {
    public static void main(String[] args) {
        var bank = new Bank();

        Client client1 = bank.createClient("Петров", 17);
        Client client2 = bank.createClient("Снегирев", 36);
        Client client3 = bank.createClient("Сидоров", 25);
        Client client4 = bank.createClient("Сидоров", 25);

        Account account1 = bank.createAccount(client1, 15000);
        Account account2 = bank.createAccount(client2, 460000);
        Account account3 = bank.createAccount(client2, 681000);
        Account account4 = bank.createAccount(client3, 843200);
        Account account5 = bank.createAccount(client3, 5050000);

        System.out.println("Все счета по клиенту " + client4.getName() + ": " + bank.getAccounts(client4));
        System.out.println("Найти клиента по счету " + account5.getCoin() + ": " + bank.findClient(account5));
    }
}