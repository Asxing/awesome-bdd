package com.holddie.cucumber.steps;

import com.holddie.cucumber.domain.AccountLog;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.而且;
import cucumber.api.java.zh_cn.那么;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * @author HoldDie
 * @date 2019-05-21 21:28
 * @vsersion 1.0
 **/
@Slf4j
public class FixedAmountWithdrawStepdefs {
    AccountLog accountLog = new AccountLog();

    @假如("^我的账户中有余额\"([^\"]*)\"元$")
    public void 我的账户中有余额元(double originPrice) {
        log.info("我的账户中有余额{}元", originPrice);
        accountLog.setAccountBalance(BigDecimal.valueOf(originPrice));
    }

    @当("^我选择固定金额取款方式取出\"([^\"]*)\"元$")
    public void 我选择固定金额取款方式取出元(double takePrice) {
        log.info("我选择固定金额取款方式取出{}元", takePrice);
        accountLog.setWithdrawAmount(BigDecimal.valueOf(takePrice));
    }

    @那么("^我应该收到现金\"([^\"]*)\"元$")
    public void 我应该收到现金元(double getPrice) {
        log.info("我应该收到现金{}元", getPrice);
        assertEquals(getPrice, accountLog.getReceiveAmount().doubleValue(), 0.0);
    }

    @而且("^我账户的余额应该是\"([^\"]*)\"元$")
    public void 我账户的余额应该是元(double finalPrice) {
        log.info("我账户的余额应该是{}元\n", finalPrice);
        assertEquals(finalPrice, accountLog.getRemainingBalance().doubleValue(), 0.0);
    }


}
