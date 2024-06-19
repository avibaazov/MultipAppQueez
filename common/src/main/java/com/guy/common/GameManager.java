package com.guy.common;

import static java.util.Collections.shuffle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameManager {
    public GameManager() {
        this.questions = new ArrayList<>(); // Initialize empty list for safety
    }

    private int hearts = 4;


    private int currentQuestion = 0;

    private ArrayList<Question> questions;

    public GameManager(DataManagerBase dataManager) {
        questions = dataManager.getQuestions();
    }

    public String getCurrentImage() {
        return questions.get(currentQuestion).getImage();
    }

    public String[] getAnswers() {
        List<String> shuffled = Arrays.asList(questions.get(currentQuestion).getAnswers());
        Collections.shuffle(shuffled);
        String[] answers = shuffled.toArray(new String[0]);

        return answers;
    }

    public void decrementHeart() {
        if (hearts > 0) {
            hearts--;
        }
    }

    public int getHearts() {
        return hearts;
    }

    public boolean isGameOver() {
        return hearts <= 0;
    }
    public boolean checkAnswer(String answer) {
        return answer.equals(questions.get(currentQuestion).getCorrectAnswer());
    }

    public void advanceToNextQuestion() {
        if (currentQuestion < questions.size() - 1) {
            currentQuestion++;
        } else {
            currentQuestion = 0; // Or handle the end of the quiz
        }
    }
}
