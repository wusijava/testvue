package com.zanclick.testvue.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ Description   :  java类作用描述
 * @ Author        :  wusi
 * @ CreateDate    :  2019/11/8$ 17:42$
 */
public class ArrayToList {
    public static void main(String[] args) {
        String[] arr=new String[]{"a","b","c"};
        List<String> list= new ArrayList<String >();
        list=Arrays.asList(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
