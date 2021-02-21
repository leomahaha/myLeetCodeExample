package com.demo.leetcode;

public class LeetCode485 {
    public static void main(String[] args) {
        LeetCode485 leetCode485=new LeetCode485();
        System.out.println(leetCode485.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int length = nums.length;
        int count=0;
        int sum=0;
        for (int i=0;i<length;i++){
            if (nums[i]==1){
                while(i<length&&nums[i]==1){
                    count++;
                    i++;
                    sum=Math.max(count,sum);
                }
                count=0;
            }
        }
        return sum;
    }
}
