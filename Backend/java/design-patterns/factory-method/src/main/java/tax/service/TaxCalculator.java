package main.java.tax.service;

import main.java.budget.Budget;
import main.java.tax.factory.TaxFactory;
import main.java.tax.model.TaxType;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calculate(Budget budget, TaxType taxType) {
        return budget.getValue().multiply(TaxFactory.getTax(taxType).getValue());
    }

}
