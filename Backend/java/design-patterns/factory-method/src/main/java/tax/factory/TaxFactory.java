package main.java.tax.factory;

import main.java.tax.model.Tax;
import main.java.tax.model.TaxType;

public class TaxFactory {

    private TaxFactory() {}

    public static Tax getTax(TaxType taxType) {
        return taxType.getConstructor().get();
    }

}
