package com.zanclick.testvue;

import java.lang.reflect.Method;

public class Reflect {
    public static void main(String[] args) throws Exception {
        Class  c= Class.forName("com.zanclick.testvue.User");
        User u=(User)c.newInstance();
        System.out.println(u);
     Method m= c.getMethod("test",c);
        System.out.println(c.getName());

    }
}
