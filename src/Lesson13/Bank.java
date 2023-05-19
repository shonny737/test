package Lesson13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    private List<Client> clients = new ArrayList<>();
    private Map<Account, Client> clientAccounts = new HashMap();
    private Map<Client, Client> clientAccountId = new HashMap();

    public List<Client> getClients() {
        return clients;
    }

    private void setClient(Client client) {
        clients.add(client);
    }

    public Client createClient(String name, int age) {
        var client = new Client(name, age);
        setClient(client);
        return client;
    }

    public Account createAccount(Client client, int coin) {
        if (client.getAge() >= 18) {
            var account = new Account(coin);
            client.setAccount(account);
            clientAccounts.put(account, client);
            clientAccountId.put(client, client);
            return account;
        } else {
            System.out.println("Клиенту " + client.getName() + " нет 18!");
            return null;
        }
    }

    public List<Account> getAccounts(Client client) {
        if (clientAccountId.containsKey(client)) {
            return clientAccountId.get(client).getAccount();
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