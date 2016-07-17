package com.bazlur.bank;

import com.bazlur.bank.exception.NegativeAmountException;
import com.bazlur.bank.exception.NotSufficientBalanceException;

import java.text.DecimalFormat;

/**
 * Created by rokon on 7/17/16.
 */
public abstract class Account {
    public final DecimalFormat MONEY = new DecimalFormat("$#,##0.00");

    private String login;
    private String password;
    private String name;

    private double balance;

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
        this.balance = 0.0;
    }

    public Account(double balance, String login, String password) {
        this.login = login;
        this.password = password;

        try {
            deposit(balance);
        } catch (NegativeAmountException e) {
            e.printStackTrace();
        }
    }

    public void transferAmount(double amount, Account transferTo) throws NegativeAmountException {
        if (amount < 0.0) {
            throw new NegativeAmountException("");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0.0) {
            throw new NegativeAmountException("Deposit amount must be positive");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) throws NotSufficientBalanceException {
        if (amount < 0.0 || amount > balance) {
            throw new NotSufficientBalanceException("withdrawal amount must be positive and couldn't greater than the balance");
        } else {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return ("balance is " + MONEY.format(balance));
    }
}
