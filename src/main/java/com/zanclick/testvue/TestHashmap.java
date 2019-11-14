package com.zanclick.testvue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestHashmap {
    public static void main(String[] args) {
        Map<String,String>  map= new HashMap<>();
        map.put("aaa","bbb");
        map.put("ccc","ddd");
        /*for (Map.Entry<String,String> entry:map.entrySet()) {
                String key=entry.getKey();
                String value=entry.getValue();
            System.out.println(key+"\t"+value);
        }*/
        for (String  key:map.keySet()) {
            String value=map.get(key);
            System.out.println(value);
        }
        int [] arr= new int[]{1,2,3};
        //初始化数组  尽量指定长度避免扩容 影响性能
        List<Integer> list= new ArrayList<>(arr.length);
        for (int i:arr) {
            list.add(i);
        }
        //当其他类型转换成字符串时  使用string.valueof(?)
        int i =1;
        String s= String.valueOf(i);
        BigDecimal decimalvalue = new BigDecimal(0.1D);
        System.out.println(decimalvalue);
        BigDecimal newvalue=BigDecimal.valueOf(0.1D);
        Double newLong=Double.valueOf(1L);
        System.out.println(newvalue);
    }
    //注释过时代码 @Deprecated
    @Deprecated
    public  void test(){

    }
}
