package com.demo.leetcode;


import java.util.ArrayList;
import java.util.List;

public class LeetCode448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] ints=new int[nums.length+1];
        List<Integer> list=new ArrayList<>();
        int length = nums.length;
        for (int i=0;i<length;i++){
            ints[nums[i]]++;
        }
        int i =1;
        while(i<ints.length){
            if (ints[i]==0){
                list.add(i);
            }
            i++;
        }
        return list;
    }
    public static void main(String[] args) {

    }


}
