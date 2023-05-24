package Lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private List<Account> accounts = new ArrayList<>();
    private String name;
    private int age;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccount() {
        return accounts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", accounts=" + accounts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}