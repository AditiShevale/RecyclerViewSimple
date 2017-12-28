package com.example.aditi.recyclerviewsimple.pojo;

/**
 * Created by aditi on 20/12/17.
 */

public class Details {

    String name;
    String surname;

    public Details(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
