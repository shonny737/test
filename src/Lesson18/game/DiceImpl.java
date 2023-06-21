package Lesson18.game;

import java.util.Random;

public class DiceImpl implements Dice {
    @Override
    public int roll() {
        return new Random().nextInt();
    }
}
