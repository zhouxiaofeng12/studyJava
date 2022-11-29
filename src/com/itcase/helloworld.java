package com.itcase;

public class helloworld {
    /**
     * @param args
     * public 访问修饰符
     * static 关键字
     * void 返回类型
     * main 方法名
     * String 类
     * args 字符串数组
     */
    public static void main(String[] args){
       test();
    }

    public static void test(){
        /**
         * 基础数据类型
         * byte
         * short
         * int
         * long
         * float
         * double
         * char
         */
        //先设置list长度
        //循环i854666
        int[] mylist=new int[10];
        mylist[1]=1;
        mylist[2]=2;
        mylist[3]=3;
        for (int i = 0; i < mylist.length; i++) {
            System.out.println(mylist[i]);
        }
    }
}
