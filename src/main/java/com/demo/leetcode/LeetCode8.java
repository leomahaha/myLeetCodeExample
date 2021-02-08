package com.demo.leetcode;

public class LeetCode8 {
    public int myAtoi(String s) {
        s=s.trim();
        char[] chars=s.toCharArray();
        char[] chars2=new char[s.length()];
        int i=0;
        for (int a =0;a<s.length();a++) {
            if (a==0&&chars[a]=='+'){
                continue;
            }
            if (a==0&&chars[a]=='-'){
                chars2[i++]='-';continue;
            }
            if (chars[a]=='.'||chars[a]<48||chars[a]>57||chars[a]==' '){
                break;
            }
            chars2[i++]=chars[a];
            String s1=new String(chars2).trim();
            if (s1.length()>0){
                if (s1.equals("-")||s1.equals("+")){
                    return 0;
                }
                Long l=  Long.parseLong(s1);
                if (l<Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }else if (l>Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
            }
        }
        String s1=new String(chars2).trim();
        if (s1.length()>0){
            if (s1.equals("-")||s1.equals("+")){
                return 0;
            }
            Long l=  Long.parseLong(s1);
            if (l<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }else if (l>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            return l.intValue();
            //判断有没有在在范围 [-231, 231 - 1] 内
        }
        return 0;
    }




    public static void main(String[] args) {
//        System.out.println(Long.parseLong("4193"));
        LeetCode8 leetCode8 = new LeetCode8();
        System.out.println(leetCode8.myAtoi("42"));
        System.out.println(leetCode8.myAtoi("   -42"));
        System.out.println(leetCode8.myAtoi("4193 with words"));
        System.out.println(leetCode8.myAtoi("words and 987"));
        System.out.println(leetCode8.myAtoi("-91283472332"));
        System.out.println(leetCode8.myAtoi("20000000000000000000"));
    }
}
