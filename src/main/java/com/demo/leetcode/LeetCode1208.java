package com.demo.leetcode;

public class LeetCode1208 {
    public int equalSubstring(String s, String t, int maxCost) {

        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        int count=0;
        int flag=0;
        int cost=0;
        int i=0;
        for (int b=0;b<chars.length;b++){
            i++;
            count+=Math.abs(chars[b]-chars1[b]);
            if (count>maxCost){
                count-=Math.abs(chars[flag]-chars1[flag]);
                flag++;i--;
            }else {
                cost=Math.max(i,cost);
            }

        }
        return cost;
    }

    public static void main(String[] args) {
        LeetCode1208 leetCode1208 = new LeetCode1208();
        System.out.println(leetCode1208.equalSubstring("abcd","bcdf",3));
        System.out.println(leetCode1208.equalSubstring("abcd","cdef",3));
        System.out.println(leetCode1208.equalSubstring("abcd","acde",0));
        System.out.println(leetCode1208.equalSubstring("krrgw", "zjxss", 19));



    }
}
