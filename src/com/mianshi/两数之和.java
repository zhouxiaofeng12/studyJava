package com.mianshi;


import java.util.HashMap;

/**
 * 输入：nums = [2,7,11,15], target = 9
 * 输入内容后，拿target-nums，获取到值，存入一个map，key-value的形式
 */
public class 两数之和 {
    public static void main(String[] args) {
        int[] nums = {11,15,2,7};
        int target = 9;
        Sum(nums, target);
    }

    public static int[] Sum(int[] nums, int target) {
        HashMap<Integer, Integer> mapValue = new HashMap();
        int[] result=new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println(num);
            System.out.println("index"+i);
            if (mapValue.keySet().contains(Math.abs(target-num))){
                System.out.println(i+"-------------"+mapValue.get(Math.abs(target-num)));
                result[0]=mapValue.get(Math.abs(target-num));
                result[1]=i;
                break;
            }
            mapValue.put(nums[i],i);
            System.out.println(mapValue);
        }
        return result;
    }
}
