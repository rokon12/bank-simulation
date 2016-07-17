package com.bazlur.bank;

import com.bazlur.bank.exception.AccountNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rokon on 7/17/16.
 */
public class Bank {
    private List<Account> accounts = new ArrayList<>();

    public Account login(String login, String password) throws AccountNotFoundException {

        for (Account account : accounts) {
            if (account.getLogin().equals(login) && account.getPassword().equals(password)) {

                return account;
            }
        }

        throw new AccountNotFoundException("Account Not found");
    }

    public void signUp(String login, String password) {

    }
}
