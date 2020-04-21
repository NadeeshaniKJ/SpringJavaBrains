package com.kanchi.t32.model;

public class Circle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("circle setter called");
//        throw (new RuntimeException());

    }

    public String setNameandReturn(String name) {
        this.name = name;
        System.out.println("circle set  and Return  called");
//        throw (new RuntimeException());
        return name;
    }
}
