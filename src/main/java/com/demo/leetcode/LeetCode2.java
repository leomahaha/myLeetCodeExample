package com.demo.leetcode;

public class LeetCode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode=new ListNode();
        int a=0;
        int b=0;
        int start=0;
        ListNode listNode2=new ListNode();
        while (l1!=null&&l2!=null){
            int sum = l1.val+l2.val+b;
            b=0;
            if (sum>9) {
                a = sum - 10;
                b = sum - 10 > -1 ? 1 : 0;
            }else {
                a=sum;
            }
            if (l1.next==null&&l2.next!=null){
                ListNode listNode1=new ListNode(0);
                l1.next=listNode1;
            }
            if (l2.next==null&&l1.next!=null){
                ListNode listNode1=new ListNode(0);
                l2.next=listNode1;
            }
            l1=l1.next;
            l2=l2.next;
            if (start==0) {
                listNode.val=a;
            }else {
                ListNode listNode1=new ListNode(a);
                if (start==1){
                    listNode.next=listNode1;
                    listNode2=listNode1;
                }else {
                    listNode2.next = listNode1;
                    listNode2=listNode1;
                }

            }
            start++;
if (l1==null&&l2==null&&b==1&&sum>9){
    ListNode listNode1=new ListNode(b);
    if (listNode.next==null){
        listNode.next=listNode1;
    }else {
        listNode2.next = listNode1;
        listNode2 = listNode1;
    }
}

        }
        return listNode;
    }

    public static void main(String[] args) {
        LeetCode2 leetCode2 = new LeetCode2();
        ListNode l1=new ListNode();
        l1.val=5;
        ListNode l2=new ListNode();
        l2.val=3;
        ListNode l3=new ListNode();
        l3.val=2;
//        l1.next=l2;
//        l2.next=l3;

        ListNode l4=new ListNode();
        l4.val=5;
        ListNode l5=new ListNode();
        l5.val=2;
        ListNode l6=new ListNode();
        l6.val=1;
//        l4.next=l5;
//        l5.next=l6;
        ListNode listNode = leetCode2.addTwoNumbers(l1, l4);
        System.out.println(listNode.val);
    }
}
