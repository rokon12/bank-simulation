package com.bazlur.unittesting;

/**
 * @author Bazlur Rahman Rokon
 * @since 7/26/16.
 */
public class Criterion implements Scoreable {
    private Weight weight;
    private Answer answer;
    private int score;

    public Criterion(Answer answer, Weight weight) {
        this.answer = answer;
        this.weight = weight;
    }

    public Answer getAnswer() { return answer; }
    public Weight getWeight() { return weight; }

    public void setScore(int score) { this.score = score; }
    public int getScore() { return score; }
}