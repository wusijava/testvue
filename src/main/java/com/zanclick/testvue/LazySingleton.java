package com.zanclick.testvue;

public class LazySingleton {
   private static LazySingleton lazySingleton;
   private static Object object= new Object();
   //私有化构造函数 使得外部无法创建对象
    private LazySingleton(){}
    //获取对对象锁 进行线程同步
    public static LazySingleton getInstance(){

        if (lazySingleton==null){
            synchronized (object){
                if (lazySingleton==null){
                    lazySingleton=new LazySingleton();
                }
            }

        }
        return lazySingleton;
    }

    public static void main(String[] args) {
        LazySingleton s1=LazySingleton.getInstance();
        LazySingleton s2=LazySingleton.getInstance();
        System.out.println(s1==s2);
    }
}
