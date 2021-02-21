package com.demo.leetcode;

import java.util.*;

public class LeetCode992 {
    public int subarraysWithKDistinct(int[] A, int K) {
        return atMostKDistinct(A, K) - atMostKDistinct(A, K - 1);
    }
    private int atMostKDistinct(int[] A, int K) {
        int len = A.length;
        int[] freq = new int[len + 1];

        int left = 0;
        int right = 0;
        // [left, right) 里不同整数的个数
        int count = 0;
        int res = 0;
        // [left, right) 包含不同整数的个数小于等于 K
        while (right < len) {
            if (freq[A[right]] == 0) {
                count++;
            }
            freq[A[right]]++;
            right++;

            while (count > K) {
                freq[A[left]]--;
                if (freq[A[left]] == 0) {
                    count--;
                }
                left++;
            }
            // [left, right) 区间的长度就是对结果的贡献
            res += right - left;
        }
        return res;
    }





    public static void main(String[] args) {
        LeetCode992 leetCode992 = new LeetCode992();
        System.out.println(leetCode992.subarraysWithKDistinct(new int[]{48,18,15,17,35,33,3,22,14,52,18,32,45,33,39,7,52,2,4,22,13,41,4,29,3,7,34,31,4,49,3,8,20,42,12,11,35,42,3,21,27,29,37,21,40,50,22,7,2,32,1,1,22,33,19,52,38,34,36,48,40,28,47,8,7,46,17,7,2,21,49,6,7,50,15,31,50,52,1,27,3,15,5,6,23,26,34,50,15,22,26,39,28,25,25,21,37,28,45},30));
    }
}
