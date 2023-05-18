package Lesson13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts(Client client) {
        List<Account> clientAccounts = new ArrayList<>();
        for (Account account : accounts) {
            if (account.getClient().equals(client)) {
                clientAccounts.add(account);
            }
        }
        return clientAccounts;
    }

    public Client findClient(Account account) {
        Map<Client, Integer> clientMap = new HashMap<>();
        for (Account acc : accounts) {
            if (acc.equals(account)) {
                Client client = acc.getClient();
                int currentAccount = clientMap.getOrDefault(client, 0);
                clientMap.put(client, currentAccount + 1);
            }
        }
        Client idAccount = null;
        for (Map.Entry<Client, Integer> entry : clientMap.entrySet()) {
            idAccount = entry.getKey();
        }
        return idAccount;
    }
}