package com.demo.leetcode;

public class LeetCode13 {
    public int romanToInt(String s) {
        String[] strings = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] ints=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
int sum = 0;

        for (int i=0;i<13;i++){
            char[] chars = s.toCharArray();
            if (s.length()==0){
                break;
            }
    if (s.length()>1&&strings[i].equals(String.valueOf(chars[0])+String.valueOf(chars[1]))){
        s=s.substring(2);
        sum+=ints[i];
    }else if (strings[i].equals(String.valueOf(chars[0]))){
        s=s.substring(1);
        sum+=ints[i];i--;
    }
}
return sum;
    }

    public static void main(String[] args) {

        LeetCode13 leetCode13 = new LeetCode13();
        System.out.println(leetCode13.romanToInt("MCMXCIV"));
    }
}
