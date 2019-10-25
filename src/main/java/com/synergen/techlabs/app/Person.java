package com.synergen.techlabs.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data @AllArgsConstructor
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String title;

}
