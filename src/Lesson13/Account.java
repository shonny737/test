package Lesson13;

import java.util.Objects;

public class Account {
    private int coin;

    public Account(int coin) {
        this.coin = coin;
    }

    public int getCoin() {
        return coin;
    }

    @Override
    public String toString() {
        return "Account{" +
                "coin=" + coin + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return coin == account.coin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coin);
    }
}