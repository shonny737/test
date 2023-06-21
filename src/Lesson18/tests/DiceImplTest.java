package Lesson18.tests;

import Lesson18.game.Dice;
import Lesson18.game.DiceImpl;

import static Lesson18.assertions.Assertions.assertEquals;

public class DiceImplTest {
    public void testRangeOfRollDieValue() {
        String scenario = "Тест выпавшего значения на кубике на принадлежность диапазону от 1 до 6.";
        try {
            Dice dice = new DiceImpl();
            int actual = dice.roll();
            assertEquals(actual);
            System.out.println("Успешно" + scenario);
        } catch (Throwable e) {
            System.err.println(scenario + " Ошибка: " + e.getMessage());
        }
    }
}