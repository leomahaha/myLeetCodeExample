package com.demo.leetcode;

public class LeetCode29 {
    public int divide(int dividend, int divisor) {
        int i=1;
        if (dividend>0){
            if (divisor<0){
                i=-1;
            }
        }
        if (dividend<0){
            if (divisor>0){
                i=-1;
            }
        }
        if(divisor == -1) {
            if (dividend > Integer.MIN_VALUE) return -dividend;// 只要不是最小的那个整数，都是直接返回相反数就好啦
            return Integer.MAX_VALUE;// 是最小的那个，那就返回最大的整数啦
        }


long dividend1=0;
        if(dividend < 0) {
            dividend1 = -new Long(dividend);
        }else {
            dividend1=new Long(dividend);
        }

        divisor=Math.abs(divisor);
        if (dividend1<divisor){
            return 0;
        }
        int k=0;
        while (dividend1>divisor){

                if (dividend1-divisor>0) {
                    dividend1 -= divisor;
                    k++;
                }else {
                    break;
                }

        }
            return k*i;
    }

    public static void main(String[] args) {
        LeetCode29 leetCode29=new LeetCode29();
        int divide = leetCode29.divide(10,3);
        System.out.println(divide);
    }
}
