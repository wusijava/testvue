package com.zanclick.testvue.leetcode;

/**
 * @ Description   :  java类作用描述
 * @ Author        :  wusi
 * @ CreateDate    :  2019/11/8$ 12:00$
 * @ UpdateUser    :  wusi
 * @ UpdateDate    :  2019/11/8$ 12:00$
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class Solution {

    public static void twoSum() {
      int[]  nums=new int[]{2,4,7,5,2};
       int target=9;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]+nums[j]==target){
                    System.out.println("i:"+i+",j:"+j);
                }

            }
        }
    }
    public static void main(String[] args) {
        twoSum();
    }

}
