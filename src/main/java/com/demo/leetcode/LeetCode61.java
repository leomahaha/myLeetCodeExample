package com.demo.leetcode;

import java.util.List;

public class LeetCode61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null||head.next==null||k==0){
            return head;
        }
        ListNode listNode = head;
        int all=0;
        while(listNode!=null){
            listNode=listNode.next;
            all++;
        }
        int i=0;
        int j=0;
        ListNode listNode1 = head;
        if (all>k){
             i=k;
        }else if (all==k) {
             return head;
        }else {
            i=k%all;
            if (i==0){
                return head;
            }
        }
        ListNode listNode2=new ListNode();
        ListNode listNode5=new ListNode();
        listNode5.next=listNode2;
        while(j<all-i){
            j++;
             listNode2.val=listNode1.val;
            if(j<all-i) {
                listNode2.next = new ListNode();
            }
            listNode2=listNode2.next;
            listNode1=listNode1.next;
        }
        ListNode listNode3 = new ListNode();
        ListNode listNode6 = new ListNode();
        listNode6.next=listNode3;
        while(listNode1!=null&&listNode1.next!=null){
            listNode3.val=listNode1.val;
            listNode3.next = new ListNode();
            listNode3=listNode3.next;
            listNode1=listNode1.next;
        }
        if (listNode1!=null) {
            listNode3.val = listNode1.val;
            listNode3.next = listNode5.next;
        }else {
            listNode3=listNode5.next;
        }
        return listNode6.next;

    }
    public static void main(String[] args) {
        LeetCode61 leetCode61=new LeetCode61();
        ListNode listNode1=new ListNode(2);
        ListNode listNode2=new ListNode(1,listNode1);
        ListNode listNode3=new ListNode(0,listNode2);
        ListNode listNode = leetCode61.rotateRight(listNode3, 4);
        System.out.println("end");
    }
}
