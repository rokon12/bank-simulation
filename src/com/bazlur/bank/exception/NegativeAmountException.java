package com.bazlur.bank.exception;

/**
 * Created by rokon on 7/17/16.
 */
public class NegativeAmountException extends Exception {
    public NegativeAmountException() {
    }

    public NegativeAmountException(String message) {
        super(message);
    }
}
