package main.java.tax.model;

import java.math.BigDecimal;

public class INSSTax implements Tax {

    @Override
    public BigDecimal getValue() {
        return new BigDecimal("0.1");
    }

}
