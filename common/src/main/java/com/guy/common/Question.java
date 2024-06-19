package com.guy.common;

public class Question {

    private String image = "";
    private String[] answers = new String[]{};
    private String CorrectAnswer;
    public Question() {}

    public String getImage() {
        return image;
    }

    public Question setImage(String image) {
        this.image = image;
        return this;
    }

    public String[] getAnswers() {
        return answers;
    }
    public String getCorrectAnswer() {
        return CorrectAnswer;  // Getter for the correct answer
    }
    public Question setAnswers(String[] answers,String CorrectAnswer) {
        this.CorrectAnswer=CorrectAnswer;
        this.answers = answers;
        return this;
    }
}
