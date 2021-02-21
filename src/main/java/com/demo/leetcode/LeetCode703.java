package com.demo.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LeetCode703 {
    class KthLargest {

        PriorityQueue<Integer> pq;
        int k;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            pq = new PriorityQueue<Integer>();
            for (int x : nums) {
                add(x);
            }
        }

        public int add(int val) {
            pq.offer(val);//堆顶加
            if (pq.size() > k) {
                pq.poll();//弹出堆首个并删除
            }
            return pq.peek();//弹出堆首个不删除
        }




    }
    public static void main(String[] args) {
        LeetCode703 leetCode703=new LeetCode703();
        LeetCode703.KthLargest kthLargest=leetCode703.new KthLargest(3,new int[]{4, 5, 8, 2});
        System.out.println(kthLargest.add(3));   // return 4
        System.out.println(kthLargest.add(5));   // return 5
        System.out.println(kthLargest.add(10));  // return 5
        System.out.println(kthLargest.add(9));   // return 8
        System.out.println(kthLargest.add(4));   // return 8

    }
}
