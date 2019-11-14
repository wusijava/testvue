package com.zanclick.testvue;

public class Singleton {
    private static Singleton singleton= new Singleton();

    public Singleton() {
    }
    public static Singleton getSingleton(){
        return  singleton;
    }

    public static void main(String[] args) {
        Singleton s1=Singleton.getSingleton();
        Singleton s2=Singleton.getSingleton();
        System.out.println(s1==s2);
    }
}
