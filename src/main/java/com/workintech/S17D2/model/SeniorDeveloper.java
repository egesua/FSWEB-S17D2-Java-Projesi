package com.workintech.S17D2.model;

public class SeniorDeveloper extends Developer{
    public SeniorDeveloper(String name, Integer id, Double salary) {
        super(name, id, salary, Experience.SENIOR);
    }
}
