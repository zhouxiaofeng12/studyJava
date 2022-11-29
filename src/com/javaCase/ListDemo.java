package com.javaCase;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args) {
        test2();
    }

    /*
    List：一种有序列表的集合，例如，按索引排列的Student的List；
    Set：一种保证没有重复元素的集合，例如，所有无重复名称的Student的Set；
    Map：一种通过键值（key-value）查找的映射表集合，例如，根据Student的name查找对应Student的Map。
    */
    public static void test2() {
        //add
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("test");
        arrayList.add("hello");
        arrayList.add("wrold");

        //删除
        arrayList.remove("test");

        //改
        arrayList.set(1,"adfaf");

        //查
        //取某个值
//        System.out.println(arrayList.get(1));
//        System.out.println(arrayList.get(0));

//        //获取坐标
//        System.out.println(arrayList.indexOf("test"));
//
//        //获取值是否的逻辑
//        System.out.println(arrayList.contains("test"));

        //遍历一个list
        ArrayList<String> listtest = new ArrayList<>();

        listtest.add("apple");
        listtest.add("pear");
        listtest.add("banana");

        //普通遍历
        for (int i = 0; i < listtest.size(); i++) {
            String s = listtest.get(i);
        }

        //迭代器
        Iterator<String> listIterator = listtest.iterator();
        while (listIterator.hasNext()) {
            String s = listIterator.next();
            System.out.println(s);
        }

    }
}
