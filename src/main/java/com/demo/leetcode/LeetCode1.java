package com.demo.leetcode;

public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a[0]=i;a[1]=j;
                }

            }
        }
        return  a;
    }

    public static void main(String[] args) {
        LeetCode1 leetCode1 = new LeetCode1();
        int[] ints = leetCode1.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(ints.length);
    }
}
