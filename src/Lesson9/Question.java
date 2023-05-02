package Lesson9;

public class Question {
    private String text;
    private Answer[] answers;
    private int correctAnswerIndex;

    public Question(String text, Answer[] answers, int correctAnswerIndex) {
        this.text = text;
        this.answers = answers;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public boolean isCorrect(int userAnswer) {
        return userAnswer == this.correctAnswerIndex;
    }

    public void printQuestion() {
        System.out.println(" Вопрос: " + this.text);
        for (int i = 0; i < answers.length; i++) {
            System.out.println((i + 1) + ". " + this.answers[i].getText());
        }
    }
}