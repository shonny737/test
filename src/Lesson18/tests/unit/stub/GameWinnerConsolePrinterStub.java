package Lesson18.tests.unit.stub;

import Lesson18.game.GameWinnerPrinter;
import Lesson18.game.Player;

public class GameWinnerConsolePrinterStub implements GameWinnerPrinter {
    public Player winner;

    @Override
    public void printWinner(Player win) {
        winner = win;
    }
}