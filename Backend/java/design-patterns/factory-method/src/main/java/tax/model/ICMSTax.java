package main.java.tax.model;

import java.math.BigDecimal;

public class ICMSTax implements Tax {

    private static final String VALUE = "0.06";

    @Override
    public BigDecimal getValue() {
        return new BigDecimal(VALUE);
    }

}
