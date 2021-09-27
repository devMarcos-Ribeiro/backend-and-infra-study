package main.java.budget;

import java.math.BigDecimal;

public class Budget {

    private final BigDecimal value;

    public Budget(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return this.value;
    }

}
