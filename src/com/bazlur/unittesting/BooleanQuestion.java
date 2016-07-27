package com.bazlur.unittesting;

/**
 * @author Bazlur Rahman Rokon
 * @since 7/26/16.
 */
public class BooleanQuestion extends Question {
    public BooleanQuestion(int id, String text) {
        super(id, text, new String[] { "No", "Yes" });
    }

    @Override
    public boolean match(int expected, int actual) {
        return expected == actual;
    }
}
