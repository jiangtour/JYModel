package com.jiangtour.model.beans;

/**
 * @author husky
 */
public class JYWalletObject extends JYObject {
    private long amount;
    private long withdrawal;
    private long blocked;
    private long income;
    private long outcome;

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(long withdrawal) {
        this.withdrawal = withdrawal;
    }

    public long getBlocked() {
        return blocked;
    }

    public void setBlocked(long blocked) {
        this.blocked = blocked;
    }

    public long getIncome() {
        return income;
    }

    public void setIncome(long income) {
        this.income = income;
    }

    public long getOutcome() {
        return outcome;
    }

    public void setOutcome(long outcome) {
        this.outcome = outcome;
    }
}
