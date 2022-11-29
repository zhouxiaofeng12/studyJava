package com.mianshi;


import java.util.List;

/**
 * 给你两个非空的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储一位数字
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头
 * <p>
 * 1.按位求和
 * 2.进位
 */



class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;

        while (head1 != null) {
            if (head2 != null) {
                head1.val += head2.val;
                head2 = head2.next;

                /**
                 L1大于L2的情况，则走下面的逻辑。则2的后面直接嫁过去
                 */
                if (head1.next==null && head2!=null){
                    head1.next=head2;
                    break;
                }
                head1=head1.next;
            }
        }
        merge(l1);
        return l1;
    }

    public void merge(ListNode head){
        while (head!=null){
            if (head.val>=10){

                head.val=head.val%10;
                if (head.next==null){
                    head.next=new ListNode(0);
                }
                head.next.val+=1;
            }
            head=head.next;
        }
    }

}

