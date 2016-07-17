package com.bazlur.bank.exception;

/**
 * Created by rokon on 7/17/16.
 */
public class NotSufficientBalanceException extends Exception {
    public NotSufficientBalanceException(String message) {
        super(message);
    }
}
