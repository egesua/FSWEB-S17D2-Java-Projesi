package com.workintech.S17D2.model;

public class Developer {
    private String name;
    private Integer id;
    private Double salary;
    private Experience experience;

    public Developer(String name, Integer id, Double salary, Experience experience) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }
}
