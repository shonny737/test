package Lesson9;

import java.util.Scanner;

public class User {
    private String name;
    Scanner console = new Scanner(System.in);

    public User() {
    }

    public String setName() {
        this.name = console.nextLine();
        return this.name;
    }
}
