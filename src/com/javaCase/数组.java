package com.javaCase;

public class 数组 {
    public static void main(String[] args) {
        test1();
    }

    /**
     * 数组是固定长度的，在初始化的时候，设置长度
     */
    public static void test1(){
        /**
         * 初始化
         */
        int[] doubles=new int[10];
        int[] intvaue={1,2,3};


        /**
         * 塞入值
         */
        doubles[1]=1;
        doubles[0]=2;
        doubles[0]=3;


        for(int i=0;i<doubles.length;i++){
            System.out.println(doubles[i]);
        }

        //for (int aDouble : doubles) {
        //    System.out.println(aDouble);
        // }

    }
}
