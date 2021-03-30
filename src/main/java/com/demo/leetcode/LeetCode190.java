package com.demo.leetcode;

public class LeetCode190 {
    public static void main(String[] args) {
//       int n=-43261596;
//                  for(int i = 31;i >= 0; i--) {
////                      System.out.println("右移i位："+i+"，结果："+(n >>> i));
//                      System.out.print(n >>> i & 1);
//                  }
//        System.out.println();
//        n=-43261596;
//        for(int i = 31;i >= 0; i--) {
//
//            System.out.print(n >>> i );
//        }
        LeetCode190 leetCode190=new LeetCode190();
        System.out.println(leetCode190.reverseBits(43261596));
    }

    public int reverseBits(int n) {
        int a=1;
        if (n<0){
            a=-1;
            n=-n;
        }
        StringBuilder s = new StringBuilder();
        for(int i = 31;i >= 0; i--) {
//
            s.append(n >>> i & 1);
        }
        String s1=s.reverse().toString();
        Integer integer=Integer.parseInt(s1,10);
        return integer*a;
    }
}
