package com.zanclick.testvue;

import lombok.Data;

@Data
public class User {
    private int id;
    private  int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    public  void test(){}

    public User() {

    }
}
