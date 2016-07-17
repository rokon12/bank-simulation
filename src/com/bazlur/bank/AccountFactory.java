package com.bazlur.bank;

import com.bazlur.bank.exception.NegativeAmountException;

/**
 * Created by rokon on 7/17/16.
 */
public class AccountFactory {
    public static Account createCurrentAccount(String login, String password) {

        return new CurrentAccount(login, password);
    }

    public static Account createCurrentAccount(String login, String password, double startingAmount) {

        return new CurrentAccount(login, password, startingAmount);
    }

    public static Account createCurrentAccount(String login, String password, double startingAmount, double monthlyFee) throws NegativeAmountException {

        CurrentAccount currentAccount = new CurrentAccount(login, password, startingAmount);
        currentAccount.setMonthlyFee(monthlyFee);

        return currentAccount;
    }
}
