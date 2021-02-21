package com.demo.leetcode;

import java.util.Arrays;

public class LeetCode33 {
    public static void main(String[] args) {
        LeetCode33 leetCode33=new LeetCode33();
        int search = leetCode33.search(new int[]{1,3}, 2);
        System.out.println(search);
    }
    public int search(int[] nums, int target) {
        int length = nums.length;
        int left=0;
        int right=length-1;
        int mid =length/2;
       return search1(nums,target,left,right,mid);
    }
    public int search1(int[] nums, int target,int left,int right,int mid) {
        if (right-left==1){
            if (nums[left]==target){
                return left;
            }
            if (nums[right]==target){
                return right;
            }
            return -1;
        }
        if (nums[mid]==target){
            return mid;
        }
        if (left>=right){
            return -1;
        }
        if (nums[left]<nums[mid]){
            if (nums[left]<=target&&nums[mid]>=target){
                int i = (left + mid) / 2;
                return search1(nums,target,left,mid,i);
            }else {
                int i = (right + mid) / 2;
                return search1(nums,target,mid,right,i);
            }
        }else  {
            if (nums[mid]<=target&&nums[right]>=target){
                int i = (right + mid) / 2;
                return search1(nums,target, mid, right,i);
            }else {
                int i = (left + mid) / 2;
                return search1(nums,target, left,mid,i);
            }
        }
    }
}
