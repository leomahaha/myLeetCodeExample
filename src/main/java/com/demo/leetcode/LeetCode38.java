package com.demo.leetcode;

public class LeetCode38 {
    public static void main(String[] args) {
        LeetCode38 leetCode38=new LeetCode38();
        String s = leetCode38.countAndSay(1);
        System.out.println(s);
    }
    public String countAndSay(int n) {
        if (n==1){
            return "1";
        }else {
            String s = countAndSay(n - 1);
            return getStr(s);
        }
    }
    String getStr(String str){
        int j=0;
        int k=0;
        StringBuilder stringBuilder=new StringBuilder();
        char[] chars = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if (chars[j]==chars[i]){
                k++;
            }else {
                stringBuilder.append(k);
                stringBuilder.append(chars[j]);
                k=1;
                j=i;
            }
        }
        stringBuilder.append(k);
        stringBuilder.append(chars[j]);
        return stringBuilder.toString();
    }
}
