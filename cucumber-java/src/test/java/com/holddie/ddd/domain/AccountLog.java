package com.holddie.ddd.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author HoldDie
 * @date 2019-05-21 23:40
 * @vsersion 1.0
 **/
@Data
public class AccountLog {
    private BigDecimal accountBalance;
    private BigDecimal withdrawAmount;
    private BigDecimal receiveAmount;
    private BigDecimal remainingBalance;

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public BigDecimal getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(BigDecimal withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
        this.receiveAmount = this.accountBalance.doubleValue() - this.withdrawAmount.doubleValue() >= 0.0 ? this.withdrawAmount : new BigDecimal(0.0);
        this.remainingBalance = this.accountBalance.subtract(this.receiveAmount);
    }

    public BigDecimal getRemainingBalance() {
        return remainingBalance;
    }

    public void setRemainingBalance(BigDecimal remainingBalance) {
        this.remainingBalance = remainingBalance;
    }

    public BigDecimal getReceiveAmount() {
        return receiveAmount;
    }

    public void setReceiveAmount(BigDecimal receiveAmount) {
        this.receiveAmount = receiveAmount;
    }
}
