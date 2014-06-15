package com.app.citizen.poll.model;

import java.util.List;

/**
 * Created by ainurminibaev on 10.06.14.
 */
public class Question {
    private int order;
    private String question;
    private List<String> possAnswers;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getPossAnswers() {
        return possAnswers;
    }

    public void setPossAnswers(List<String> possAnswers) {
        this.possAnswers = possAnswers;
    }
}
