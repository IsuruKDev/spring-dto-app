package com.synergen.techlabs.app;

import lombok.Data;
import lombok.ToString;


@Data
public class Employee extends Person {

    private int salary;
    private String company;

    public Employee(String firstName, String lastName, int age, String title){
        super(firstName, lastName, age, title);
    }
}
