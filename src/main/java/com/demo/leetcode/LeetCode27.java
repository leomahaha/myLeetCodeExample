package com.demo.leetcode;

public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int count=0;
        for (int i=0;i<length;i++){
            if (nums[i]==val){
                int left=i+1;
                while(left<length){
                    if(nums[left]!=val){
                        int temp=nums[left];
                        nums[i]=temp;
                        nums[left]=val;
                        count++;
                        break;
                    }
                    left++;
                }
            }else {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        LeetCode27 leetCode27=new LeetCode27();
        int i = leetCode27.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
        System.out.println(i);
    }
}
