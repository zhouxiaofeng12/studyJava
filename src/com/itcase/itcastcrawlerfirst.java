package com.itcase;

public class itcastcrawlerfirst {

    public static void main(String[] args) {
        int[] nums={-1, 2, 3, 4};
        System.out.printf(getDisappearNum(nums)+"");
    }

    public static int getDisappearNum(int[] nums) {

        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == left + 1)  //在理想合法的位置
            {
                left++;
            } else if (nums[left] > right || nums[left] <= left) //不合法
            {
                nums[left] = nums[--right];
            } else //合法但不在正确位置的元素（把它交换到正确的位置）
            {
                //nums[nums[left] - 1]表示nums[left]应该在的正确位置
                swap(nums, left, nums[left] - 1);
            }
        }
        return left + 1;
    }

    private static void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

}
