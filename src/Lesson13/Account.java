package Lesson13;

public class Account {
    private Client client;
    private int coin;

    public Account(Client client, int coin) {
        this.client = client;
        this.coin = coin;
    }

    public Client getClient() {
        return client;
    }

    public int getCoin() {
        return coin;
    }
}