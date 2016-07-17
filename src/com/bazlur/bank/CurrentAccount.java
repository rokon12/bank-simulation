package com.bazlur.bank;

import com.bazlur.bank.exception.NegativeAmountException;

/**
 * Created by rokon on 7/17/16.
 */
public class CurrentAccount extends Account {
    public final double DEFAULT_MONTHLY_FEE = 5.00;
    private double monthlyFee;

    public CurrentAccount(String login, String password) {
        super(login, password);
        this.monthlyFee = DEFAULT_MONTHLY_FEE;
    }

    public CurrentAccount(String login, String password, double balance) {
        super(balance, login, password);
        this.monthlyFee = DEFAULT_MONTHLY_FEE;
    }

    public CurrentAccount(double balance, String login, String password, double monthlyFee) {
        super(balance, login, password);
        this.monthlyFee = monthlyFee;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) throws NegativeAmountException {
        if (monthlyFee < 0.0) {
            throw new NegativeAmountException("MonthlyFee cannot be negative");
        } else {
            this.monthlyFee = monthlyFee;
        }
    }
}
