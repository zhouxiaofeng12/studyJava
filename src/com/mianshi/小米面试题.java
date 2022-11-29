package com.mianshi;

//```
//        给定一个无序数组arr，找到数组中未出现的最小正整数
//        例如
//        arr = [-1, 2, 3, 4]。返回1
//        arr = [1, 2, 3, 4]。返回5


          //思路
          //搞个index+1是否等于当前位置的值，或者说值-1是否等于index，获取相应的值
//```
public class 小米面试题 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4};
        System.out.println("result===" + minNumberdisappered(arr));
    }

    public static int minNumberdisappered(int[] arr) {
        int count = arr.length;
        for (int i = 0; i < count; i++) {
            while (arr[i] >= 1 && arr[i] <= count && arr[arr[i] - 1] != arr[i]) {
                //进行交换
                //数组arr，arr[i]-1这个就是坐标的值，坐标
                swap(arr, arr[i] - 1, i);
            }
        }

        for (int j = 0; j < count; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return arr.length + 1;
    }


    //swap(arr, arr[i] - 1, i);
    public static void swap(int[] arr, int sourcePos, int targetPos) {
        System.out.println(sourcePos);
        System.out.println(targetPos);
        System.out.println("========================");

        int temp = arr[sourcePos];
        arr[sourcePos] = arr[targetPos];
        arr[targetPos] = temp;
        System.out.println("========================");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("========================");
    }

}



