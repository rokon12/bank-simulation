package com.bazlur.bank.exception;

/**
 * Created by rokon on 7/17/16.
 */
public class AccountNotFoundException extends Exception {
    public AccountNotFoundException() {
    }

    public AccountNotFoundException(String message) {
        super(message);
    }
}
