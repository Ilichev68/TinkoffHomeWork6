package com.example.user.tinkoffhomework6;

import java.math.BigDecimal;

/**
 * Created by User on 06.11.2017.
 */

public class ObjectForBigDecimal {

    private BigDecimal money_amount;

    public ObjectForBigDecimal(BigDecimal money_amount) {
        this.money_amount = money_amount;
    }

    public BigDecimal getMoney_amount() {
        return money_amount;
    }

    public void setMoney_amount(BigDecimal money_amount) {
        this.money_amount = money_amount;
    }
}
