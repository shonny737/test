package Lesson9;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        var user = new User();
        var result = new Result();
        Scanner console = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        System.out.println("Здравствуйте, " + user.setName() + ". Вы на экзамене в ГАИ. Выберите правильный ответ из предложенных вариантов. \n");

        Question[] questions = {
                new Question("Какой цвет светофора обозначает команду «Движение разрешено»?",
                        new Answer[]{
                                new Answer("Красный", false),
                                new Answer("Зеленый", true),
                                new Answer("Жёлтый", false)
                        }, 2),
                new Question("Какой цвет светофора обозначает команду «Приготовиться к движению»?",
                        new Answer[]{
                                new Answer("Красный", false),
                                new Answer("Зеленый", false),
                                new Answer("Жёлтый", true)
                        }, 3),
                new Question("Какой цвет светофора обозначает команду «Движение запрещено»?",
                        new Answer[]{
                                new Answer("Красный", true),
                                new Answer("Зеленый", false),
                                new Answer("Жёлтый", false)
                        }, 1)
        };

        for (int i = 0; i < questions.length; i++) {
            System.out.print(i + 1 + ")");
            questions[i].printQuestion();
            System.out.print("Введите номер вашего ответа: \n");
            int userAnswer = console.nextInt();
            if (userAnswer > 3 || userAnswer == 0) {
                throw new IllegalArgumentException("Такой светофор еще не придумали. Введите число от 1 до 3.");
            }
            if (questions[i].isCorrect(userAnswer)) {
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