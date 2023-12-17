package com.workintech.S17D2.tax;

public class DeveloperTax implements Taxable{

    public DeveloperTax() {
        super();
    }

    @Override
    public Double getSimpleTaxRate() {
        return 15d;
    }

    @Override
    public Double getMiddleTaxRate() {
        return 25d;
    }

    @Override
    public Double getUpperTaxRate() {
        return 35d;
    }
}
}
