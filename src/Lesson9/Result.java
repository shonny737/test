package Lesson9;

public class Result {
    private int rightCount;
    private int wrongCount;
    private int questionCount;

    public Result() {
        this.rightCount = 0;
        this.wrongCount = 0;
        this.questionCount = 0;
    }

    public void increaseRightCount() {
        this.rightCount++;
        this.questionCount++;
    }

    public void increaseWrongCount() {
        this.wrongCount++;
        this.questionCount++;
    }

    public void printResult() {
        System.out.println("Результат экзамена: количество правильных ответов - " + this.rightCount +
                ", количество неправильных ответов - " + this.wrongCount + ". Общее количество вопросов: " + this.questionCount + ".\n");
    }

    public String finalResult() {
        if (this.rightCount == 0) {
            return "Тут без шансов. Не выбрано ни одного правильного ответа =(";
        } else if (this.rightCount == 1) {
            return "Все плохо - нужно идти на пересдачу =(";
        } else if (this.rightCount == 2) {
            return "Неплохо - но нужно повторить";
        } else if (this.rightCount == questionCount) {
            return "Отлично - ты сдал экзамен!";
        } else {
            return "Что-то пошло не так. Проверьте правильность работы программы.";
        }
    }
}