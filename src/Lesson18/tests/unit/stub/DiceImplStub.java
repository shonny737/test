package Lesson18.tests.unit.stub;

import Lesson18.game.Dice;

public class DiceImplStub implements Dice {
    @Override
    public int roll() {
        return 6;
    }
}
