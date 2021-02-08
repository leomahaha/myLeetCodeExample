package com.demo.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {

        int num=0;
        int sum=0;
        int left=0;
        Map<String,Integer> map=new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i=0;i<s.length();i++){
            if (!map.containsKey(String.valueOf(chars[i]))){
                map.put(String.valueOf(chars[i]),1);
                num++;
                sum=Math.max(sum,num);
            }else {
                map.clear();
                i=left;
                left++;
                num=0;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        LeetCode3 leetCode3 = new LeetCode3();
        System.out.println(leetCode3.lengthOfLongestSubstring("aab"));
    }
}
