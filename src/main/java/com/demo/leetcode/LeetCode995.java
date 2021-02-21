package com.demo.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode995 {
    public static void main(String[] args) {
        LeetCode995 leetCode995=new LeetCode995();
        int i = leetCode995.minKBitFlips(new int[]{0, 1, 0}, 1);
        System.out.println(i);
    }
    public int minKBitFlips(int[] A, int K) {
        int res = 0;
        Deque<Integer> que = new LinkedList<>();
        for (int i = 0; i < A.length; i++) {
            if (que.size() > 0 && i > que.peek() + K - 1) {
                que.removeFirst();
            }
            //1.本来是1，翻转奇数次变为0，所以需要再次翻转，放入队列
            //2.本来是0，翻转偶数次还是0，所以需要再次翻转，放入队列
            if (que.size() % 2 == A[i]) {
                if (i + K > A.length) return -1;
                que.add(i);
                res += 1;
            }
        }
        return res;
    }


}
//11001110
//11110110
//11111000
//11111111