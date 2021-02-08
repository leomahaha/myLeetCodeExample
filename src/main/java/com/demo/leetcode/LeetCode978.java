package com.demo.leetcode;

public class LeetCode978 {
    public int maxTurbulenceSize(int[] arr) {
        int length=0;int sum = 0;
        boolean a=true,b=true;
        for (int i=0,j=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]&&b){
a=true;
b=false;
sum++;
length=Math.max(length,sum);continue;
            }
            if (arr[i]<arr[i+1]&&a){
                b=true;
                a=false;
                sum++;
                length=Math.max(length,sum);
                continue;
            }

                i=j;j++;sum=0;

        }

        return length;
    }
    public static void main(String[] args) {
        LeetCode978 leetCode978=new LeetCode978();
        System.out.println(leetCode978.maxTurbulenceSize(new int[]{9,4,2,10,7,8,8,1,9}));
    }
}
