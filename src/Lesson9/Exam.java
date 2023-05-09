package Lesson9;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import static java.util.List.of;

public class Exam {
    private static List<Question> questions;

    public static void main(String[] args) {
        var user = new User();
        var result = new Result();
        Scanner console = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        System.out.println("Здравствуйте, " + user.setName() + ". Вы на экзамене в ГАИ. Выберите правильный ответ из предложенных вариантов. \n");

        questions = new ArrayList<>();
        questions.add(new Question("Какой цвет светофора обозначает команду «Движение разрешено»?",
                of("Красный", "Зеленый", "Жёлтый"), 2));
        questions.add(new Question("Какой цвет светофора обозначает команду «Приготовиться к движению»?",
                of("Красный", "Зеленый", "Жёлтый"), 3));
        questions.add(new Question("Какой цвет светофора обозначает команду «Движение запрещено»?",
                of("Красный", "Зеленый", "Жёлтый"), 1));

        for (int i = 0; i < questions.size(); i++) {
            System.out.print(i + 1 + ")");
            questions.get(i).printQuestion();
            System.out.print("Введите номер вашего ответа: \n");
            int userAnswer = console.nextInt();
            if (userAnswer > 3 || userAnswer == 0) {
                throw new IllegalArgumentException("Такой светофор еще не придумали. Введите число от 1 до 3.");
            }
            if (questions.get(i).isCorrect(userAnswer)) {
                result.increaseRightCount();
            } else {
                result.increaseWrongCount();
            }
        }

        result.printResult();

        String examGrade = result.finalResult();
        System.out.println("Итоговый результат: " + examGrade);
    }
}