package Lesson6;

import java.util.Scanner;

public class TrafficLights {
    public static void main(String[] args) {

        int rightCount = 0;
        int wrongCount = 0;
        String[] question = {
                "1). Какой цвет светофора обозначает команду «Движение разрешено»?",
                "2). Какой цвет светофора обозначает команду «Приготовиться к движению»?",
                "3). Какой цвет светофора обозначает команду «Движение запрещено»?"
        };
        String[][] answer = {
                {"Красный", "Зеленый", "Жёлтый"},
                {"Красный", "Зеленый", "Жёлтый"},
                {"Красный", "Зеленый", "Жёлтый"},
        };
        int[] rightAnswer = {2, 3, 1};

        Scanner console = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = console.nextLine();
        System.out.println("Здравствуйте, " + name + ". Вы на экзамене в ГАИ. Выберите правильный ответ из предложенных вариантов. \n");

        for (int i = 0; i < question.length; i++) {
            System.out.println("Вопрос: " + question[i]);
            for (int j = 0; j < answer[i].length; j++) {
                System.out.println((j + 1) + ". " + answer[i][j]);

            }
            System.out.print("Введите номер вашего ответа: \n");
            int userAnswer = console.nextInt();
            if (userAnswer == rightAnswer[i]) {
                rightCount++;
            } else {
                wrongCount++;
            }
            if (userAnswer > 3 || userAnswer == 0) {
                throw new IllegalArgumentException("Такой светофор еще не придумали. Введите число от 1 до 3.");
            }
        }

        System.out.println("Результат экзамена: количество правильных ответов - " + rightCount + ", количество неправильных ответов - "
                + wrongCount + ". Общее количество вопросов: " + question.length + ".\n");

        String result = switch (rightCount) {
            case 1 -> result = "Все плохо - нужно идти на пересдачу =(";
            case 2 -> result = "Неплохо - но нужно повторить";
            case 3 -> result = "Отлично - ты сдал экзамен!";
            default -> ("Тут без шансов. Не выбрано ни одного правильного ответа =( ");
        };
        System.out.println(result);
    }
}