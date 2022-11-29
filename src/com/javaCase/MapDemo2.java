package com.javaCase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class MapDemo2 {
    /**
     * 请编写一个根据name查找score的程序，并利用Map充当缓存，以提高查找效率
     *
     */

    public static void main(String[] args) {
        run();
    }


    public static void run() {
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();

        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        Sites.remove(4);


        /**
         * entrySet() 方法返回映射中包含的映射的 Set 视图。
         */
        for (Entry<Integer,String> entry:Sites.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        /**
         * 根据key获取value
         */
        for (Integer i:Sites.keySet()){
            System.out.println("key: " + i + " value: " + Sites.get(i));
        }
    }

}
