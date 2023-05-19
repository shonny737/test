package Lesson13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    private Map<Account, Client> clientAccounts = new HashMap();
    private Map<Client, List<Account>> clientAccountId = new HashMap();

    public Client createClient(String name, int age) {
        var client = new Client(name, age);
        return client;
    }

    public Account createAccount(Client client, int coin) {
        if (client.getAge() >= 18) {
            var account = new Account(coin);
            client.setAccount(account);
            clientAccounts.put(account, client);
            clientAccountId.put(client, client.getAccount());
            return account;
        } else {
            System.out.println("Клиенту " + client.getName() + " нет 18!");
            return null;
        }
    }

    public List<Account> getAccounts(Client client) {
        if (clientAccountId.containsKey(client)) {
            return clientAccountId.get(client);
        } else
            System.out.println("Клиент с таким счетом не найден");
        return null;
    }

    public Client findClient(Account account) {
        if (clientAccounts.containsKey(account)) {
            return clientAccounts.get(account);
        } else
            System.out.println("Клиент с таким счетом не найден");
        return null;
    }
}