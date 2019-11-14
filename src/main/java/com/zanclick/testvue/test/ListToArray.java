package com.zanclick.testvue.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @ Description   :  测试list转数组
 * @ Author        :  wusi
 * @ CreateDate    :  2019/11/8$ 17:23$
 */
public class ListToArray {
    public static void main(String[] args) {
        List<String>  list=new ArrayList<>(4);
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("d");
        String[] arrays= new String[list.size()];
        list.toArray(arrays);
        for (int i = 0; i <arrays.length ; i++) {
            System.out.println(arrays[i]);
        }

    }
}
