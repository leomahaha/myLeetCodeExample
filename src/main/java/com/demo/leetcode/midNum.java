package com.demo.leetcode;

import java.util.Arrays;

public class midNum {
    public double[] medianSlidingWindow(int[] nums, int k) {
        int size = nums.length;
        double[] nums1 = new double[size+1-k];
        for (int i = 0 ;i<size+1-k;i++){

          int[]nums2=new int[k];

            System.arraycopy(nums, i, nums2, 0, k);
            Arrays.sort(nums2);

            if (k%2==0){
                Long i1 = new Long(nums2[k / 2 - 1]) + nums2[k / 2];
                nums1[i]=(new Double(i1))/2;
            }else {
                nums1[i]=nums2[(k+1)/2-1];
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        midNum midNum=new midNum();
        int[]nums={2147483647,2147483647};
        midNum.medianSlidingWindow(nums,2);
    }
}
