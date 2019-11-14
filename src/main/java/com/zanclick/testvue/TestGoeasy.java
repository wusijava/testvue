package com.zanclick.testvue;

import io.goeasy.GoEasy;

import java.util.ArrayList;
import java.util.HashMap;


public class TestGoeasy {
    public static void main(String[] args) {
       /* GoEasy go= new GoEasy("http://rest-hangzhou.goeasy.io","BC-9d509c96781a4c2bb632052bf4db0d52");
        go.publish("aabb","什么玩意");*/

        /*ArrayList<String> list = new ArrayList<>();
        list.add("小波");
        list.add("小啵啵啵");
        list.forEach(t-> System.out.println(t));*/
       /* ArrayList<User> userList = new ArrayList<>();
        userList.add(new User(1,22,"小肉"));
        userList.add(new User(2,80,"小换"));
        userList.add(new User(3,22,"小雪"));
        userList.removeIf(t->t.getAge()>79);
        userList.forEach(t-> System.out.println(t));*/
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("兄啊","哥");
        hashMap.put("波波","你好撒");
        hashMap.forEach((Q,S)-> System.out.println(Q+"5555"+S));

    }
}
