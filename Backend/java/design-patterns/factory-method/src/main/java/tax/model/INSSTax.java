package main.java.tax.model;

import java.math.BigDecimal;

public class INSSTax implements Tax {

    private static final String VALUE = "0.1";

    @Override
    public BigDecimal getValue() {
        return new BigDecimal(VALUE);
    }

}
