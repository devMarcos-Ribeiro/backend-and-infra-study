package main.java.tax.model;

import java.math.BigDecimal;

public class ICMSTax implements Tax {

    @Override
    public BigDecimal getValue() {
        return new BigDecimal("0.06");
    }

}
