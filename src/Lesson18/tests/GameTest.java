package Lesson18.tests;

import Lesson18.game.*;
import Lesson18.tests.unit.stub.*;

public class GameTest {
    public void testGameOnFieldNull() {

        String scenario = "Тест на null в игре.";
        try {
            DiceImpl dice = null;
            GameWinnerConsolePrinter gameWinnerConsolePrinter = null;
            Game game = new Game(dice, gameWinnerConsolePrinter);

            Player player1 = new Player("Вася");
            Player player2 = new Player("Игорь");
            game.playGame(player1, player2);

            System.out.println("Успешно " + scenario);
        } catch (Throwable e) {
            System.err.println(scenario + " Ошибка: " + e.getClass().getName());
        }
    }

    public static void testGameOnEqualsValues() {
        String scenario = "Тест на одинаковые значения у двух игроков.";
        try {
            DiceImplStub testDice = new DiceImplStub();
            GameWinnerConsolePrinterStub winnerPrinterTest = new GameWinnerConsolePrinterStub();

            Player player1 = new Player("Вася");
            Player player2 = new Player("Игорь");
            Game gameTest = new Game(testDice, winnerPrinterTest);
            gameTest.playGame(player1, player2);

            if (winnerPrinterTest.winner == null)
                System.out.printf("\"%s\" Успешно %n", scenario);
            else {
                throw new Exception("Ничья, выпало одинаковое значение");
            }
        } catch (Exception e) {
            System.err.printf("\"%s\" Ошибка: \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testGameWinFirstPlayer() {
        String scenario = "Тест должен выиграть первый игрок";
        try {
            DiceImplStub2 testDice = new DiceImplStub2();
            GameWinnerConsolePrinterStub winnerPrinterTest = new GameWinnerConsolePrinterStub();

            Player winPlayer = new Player("Вася");
            Player loserPlayer = new Player("Игорь");
            Game game = new Game(testDice, winnerPrinterTest);

            game.playGame(winPlayer, loserPlayer);
            if (winnerPrinterTest.winner == winPlayer) {
                System.out.printf("\"%s\" Успешно. %n", scenario);
            } else {
                throw new Exception("Выиграл игрок 2: " + loserPlayer.getName());
            }
        } catch (Exception e) {
            System.err.printf("\"%s\" Ошибка: \"%s\" %n", scenario, e.getMessage());
        }
    }
}