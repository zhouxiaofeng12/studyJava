package com.mianshi;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 1.三个数的乘积，可以先进行排序，然后从小到大排序
 * 2.或者本身开始先设置最小值，最大值，
 */

public class 三个数的最大乘积 {
    public static void main(String[] args) {
//        System.out.println(getMaxMin());
        System.out.println(test());
    }


    //方法1：sort排序后，倒数2位*最大一位
    public static int test(){
        int[] nums={1,2,3,-1,-2,-3};
        int n = nums.length;
        //排序后，从小到大，{-3,-2,-1,1,2,3}
        Arrays.sort(nums);
//        System.out.println(nums[0]*nums[1]*nums[n-1]);
//        System.out.println(nums[n-1]*nums[n-2]*nums[n-3]);
        return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
    }

    //方法2:
    /**
     * Integer.MAX_VALUE表示int数据类型的最大取值数：2 147 483 647
     * Integer.MIN_VALUE表示int数据类型的最小取值数：-2 147 483 648
     */
    public static int getMaxMin(){
        /**
         * MIN1=2147483647  MIN2=2147483647
         * x = 4 ，对比小
         * MIN1=4 MIN2=2147483647
         * x=2
         * MIN1=2 MIN2=4
         */
        int[] nums={1,2,3,-1,-2,-3};
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;

        for (int x : nums) {
            if (x<min1){
                min2=min1;
                min1=x;
            }else if(x<min2){
                min2=x;
            }
            /**
             * MAX1=-2147483647  MAX2=-2147483647
             * x = 4 ,对比大
             * MAX1=4 MAX2=-2147483647
             * x=2,对比大
             * MAX1=4 MAX2=2

             * x=10,对比大
             *MAX1=10 MAX2=4
             */
            if (x>max1){
                max3=max2;
                max2=max1;
                max1=x;
            }else if (x>max2){
                max3=max2;
                max2=x;
            }else if (x>max3){
                max3=x;
            }
        }
        return Math.max((min1*min2*max1),(max1*max2*max3));
    }


}
