package com.zanclick.testvue;

import com.zanclick.testvue.EnumTest;
import com.zanclick.testvue.Md5Test;

import java.awt.print.Pageable;

public class TestLanbda {
    public static void main(String[] args) throws ClassNotFoundException {
       /* new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(111);
            }
        }).start();*/

       // new Thread(()-> System.out.println(1111)).start();
        Class c=Class.forName("com.zanclick.testvue.Md5Test");
        String name=c.getName();
        Package pakage=c.getPackage();
        System.out.println(name);
        System.out.println(pakage);
    }
}
