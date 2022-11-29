package com.mianshi;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode {" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    // 2 -> 4 -> 6
    // head 2
    // node 4
    // tail 6
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode node = new ListNode(4);
        ListNode tail = new ListNode(6);
        head.next = node;
        node.next=tail;

        System.out.println(head);

        while(head!=null){
            head = head.next;
        }
        System.out.println(head.val);

    }
}


//class Student {
//    int age;
//    Student stu;
//
//    public Student(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "age=" + age +
//                ", stu=" + stu +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        Student s1 = new Student(18);
//        Student s2 = new Student(20);
//        s1.stu = s2;
//        System.out.println(s1.toString());
//
//    }
//}

