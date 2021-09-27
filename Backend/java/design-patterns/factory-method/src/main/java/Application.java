package main.java;

import main.java.budget.Budget;
import main.java.tax.service.TaxCalculator;
import main.java.tax.model.TaxType;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        var budget = new Budget(new BigDecimal("100"));
        var taxCalculator = new TaxCalculator();
        System.out.println(String.format("ICMS: %s", taxCalculator.calculate(budget, TaxType.ICMS)));
        System.out.println(String.format("INSS: %s", taxCalculator.calculate(budget, TaxType.INSS)));
    }

}
