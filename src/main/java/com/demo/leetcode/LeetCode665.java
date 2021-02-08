package com.demo.leetcode;

public class LeetCode665 {
    public boolean checkPossibility(int[] nums) {
        int k = 0;
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                k++;
                j = i;
            }
        }
        if (k > 1) {
            return false;
        } else if (k == 1) {
            if (j + 1 < nums.length&&(j-1>-1&&nums[j - 1] > nums[j + 1])) {
                if (j + 2 < nums.length && nums[j] > nums[j + 2]) {
                    return false;
                }
            }
        }
        return true;


//        int n = nums.length;
//        for (int i = 0; i < n - 1; ++i) {
//            int x = nums[i], y = nums[i + 1];
//            if (x > y) {
//                nums[i] = y;
//                if (isSorted(nums)) {
//                    return true;
//                }
//                nums[i] = x; // 复原
//                nums[i + 1] = x;
//                return isSorted(nums);
//            }
//        }
//        return true;
//    }
//
//    public boolean isSorted(int[] nums) {
//        int n = nums.length;
//        for (int i = 1; i < n; ++i) {
//            if (nums[i - 1] > nums[i]) {
//                return false;
//            }
//        }
//        return true;
//
//
//    }
    }
    public static void main(String[] args) {
        LeetCode665 leetCode665=new LeetCode665();
        System.out.println(leetCode665.checkPossibility(new int[]{4,2,3}));
    }
}
