package Lesson18.assertions;

public class Assertions {
    public static void assertEquals(int actual) {
        int minValue = 1;
        int maxValue = 6;
        if (actual < minValue || actual > maxValue) {
            throw new AssertionError("Ожидаемое значение на кубике от 1 до 6 = " + actual);
        }
    }

    public static void assertEquals(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Ожидаемая строка " + expected + " не равна " + actual);
        }
    }
}