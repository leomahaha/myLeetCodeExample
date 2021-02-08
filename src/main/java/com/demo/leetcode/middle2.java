package com.demo.leetcode;

import java.util.List;

public class middle2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        while(l1.next!=null){
            s1.append(l1.val);
            l1=l1.next;
        }
        s1.append(l1.val);
        while(l2.next!=null){
            s2.append(l2.val);
            l2=l2.next;
        }
        s2.append(l2.val);
        long n1=Long.valueOf(s1.reverse().toString());
        long n2=Long.valueOf(s2.reverse().toString());
        long sum=n1+n2;
        String all=new StringBuilder(String.valueOf(sum)).reverse().toString();
        char[] chars=all.toCharArray();
        int l=chars.length;
        ListNode listNode = new ListNode(new Integer(String.valueOf(chars[0])));
        return getListNode(listNode,0,l,chars);

    }
    ListNode getListNode(ListNode listNode,int i,int length,char chars[]){
        ListNode listNode1=new ListNode(new Integer(String.valueOf(chars[i])));
        if(i+1<length){
            listNode = new ListNode(new Integer(String.valueOf(chars[i])));
            listNode.next=getListNode(listNode,i+1,length,chars);
            return listNode;
        }
        listNode1.next=null;
        return listNode1;
    }

    public static void main(String[] args) {
        middle2 middle2=new middle2();
        ListNode a=new ListNode();
        a.val=2;
        ListNode a1=new ListNode();
        a1.val=4;
        a.next=a1;
        ListNode a2=new ListNode();
        a2.val=3;
        a1.next=a2;
        ListNode a3=new ListNode();
        a3.val=5;
        ListNode a4=new ListNode();
        a4.val=6;
        a3.next=a4;
        ListNode a5=new ListNode();
        a5.val=4;
        a4.next=a5;
        ListNode listNode = middle2.addTwoNumbers(a,a3);
        System.out.println(listNode.val);
    }
}
