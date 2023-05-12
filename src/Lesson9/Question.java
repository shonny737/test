package Lesson9;

import java.util.List;

public class Question {
    private String text;
    private List<String> answers;
    private int correctAnswerIndex;

    public Question(String text, List<String> answers, int correctAnswerIndex) {
        this.text = text;
        this.answers = answers;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public boolean isCorrect(int userAnswer) {
        return userAnswer == this.correctAnswerIndex;
    }

    public void printQuestion() {
        System.out.println(" Вопрос: " + this.text);
        for (int i = 0; i < answers.size(); i++) {
            System.out.println((i + 1) + ". " + answers.get(i));
        }
    }
}