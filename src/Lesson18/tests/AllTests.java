package Lesson18.tests;

public class AllTests {
    public static void main(String[] args) {
        new DiceImplTest().testRangeOfRollDieValue();
        new GameTest().testGameOnFieldNull();
        new GameTest().testGameOnEqualsValues();
        new GameTest().testGameWinFirstPlayer();
    }
}
