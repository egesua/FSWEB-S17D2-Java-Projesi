package com.workintech.S17D2.model;

import com.workintech.S17D2.tax.Taxable;
import com.workintech.S17D2.utils.Constants;;

public class DeveloperFactory {



    public static Developer createDeveloper(Developer developer, Taxable taxable) {
        Developer createdDeveloper = null;
        if (developer.getExperience().name().equalsIgnoreCase(Constants.Constants.JUNIOR)) {
            createdDeveloper = new JuniorDeveloper(developer.getId(), developer.getName(),
                    (developer.getSalary() - (developer.getSalary() * taxable.getSimpleTaxRate()) / 100));
        } else if (developer.getExperience().name().equalsIgnoreCase(Constants.MID)) {
            createdDeveloper = new MidDeveloper(developer.getId(), developer.getName(), (developer.getSalary() - (developer.getSalary() * taxable.getMiddleTaxRate()) / 100));
        } else if (developer.getExperience().name().equalsIgnoreCase(Constants.SENIOR)) {
            createdDeveloper = new SeniorDeveloper(developer.getId(), developer.getName(), (developer.getSalary() - (developer.getSalary() * taxable.getUpperTaxRate()) / 100));
        }

        return createdDeveloper;
    }
}