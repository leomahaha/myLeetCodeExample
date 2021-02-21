package com.demo.leetcode;

public class LeetCode28 {
    public int strStr(String haystack, String needle) {
        if (haystack.length()==0||needle.length()==0){
            return 0;
        }
        char[] chars = haystack.toCharArray();
        char[] chars1 = needle.toCharArray();
        int left=0;
        for (int i=0;i<chars.length;i++){
            if (chars[i]==chars1[0]){
                int right=0;
                left=i;
                int count=0;
                while(right<chars1.length&&left+right<chars.length){

                    if (chars[left+right]!=chars1[right]){
                        left++;
                        count--;
                    }else {
                        right++;
                        count++;
                    }
                    if (count==chars1.length){
                        return left;
                    }
                }

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LeetCode28 leetCode28=new LeetCode28();
        int i = leetCode28.strStr("hello","ll");
        System.out.println(i);
    }
}
