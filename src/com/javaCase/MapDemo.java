package com.javaCase;

import java.util.HashMap;
import java.util.Map;

class Student{
    public String name;
    public int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}


public class MapDemo {
    public static void main(String[] args) {
        Student s = new Student("Xiao Ming", 99);
        /**
         * 设置一个map
         */
        HashMap<String,Student> map=new HashMap<>();
        map.put("Xiao Ming",s);

        Student target = map.get("Xiao Ming");
        System.out.println(target == s);
        System.out.println(target.age);
        System.out.println(target.name);

        /**
         * 查看逻辑
         */
        Student another = map.get("Bob"); // 通过另一个key查找
        System.out.println(another); // 未找到返回null

        /**
         * Map<K,W>是一种键值对映射表，我们调用put(K key, V value)方法时，就把key和value做了映射并放入Map
         */
        HashMap<String,Integer> map1=new HashMap<>();
        map1.put("apple",123);
        map1.put("pear",456);
        map1.put("banana",789);

        /**
         * 改就是直接替换了
         */

        /**
         * 查
         */
        for (String key:map1.keySet()){
            Integer integer = map1.get(key);
            System.out.println(integer+"___"+key);
        }

        for(Map.Entry<String,Integer> entry:map1.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"_____"+value);
        }
    }


    /**
     * Map与list不同，map存储的都是key—value，
     */

}
