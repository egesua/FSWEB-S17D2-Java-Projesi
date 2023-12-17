package com.workintech.S17D2.model;

public class JuniorDeveloper extends Developer{
    public JuniorDeveloper(String name, Integer id, Double salary) {
        super(name, id, salary, Experience.JUNIOR);
    }

}
