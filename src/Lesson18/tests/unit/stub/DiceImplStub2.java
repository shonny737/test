package Lesson18.tests.unit.stub;

import Lesson18.game.Dice;

public class DiceImplStub2 implements Dice {
    int actual = 0;

    @Override
    public int roll() {
        int a;
        if (actual == 0) {
            a = 6;
        } else
            a = 1;
        ++actual;
        return a;
    }
}