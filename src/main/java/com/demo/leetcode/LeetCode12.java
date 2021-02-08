package com.demo.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode12 {
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

    public String intToRoman(int num) {
StringBuilder stringBuilder = new StringBuilder();
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"I");
        map.put(5,"V");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");
        map.put(4,"IV");
        map.put(9,"IX");
        map.put(40,"XL");
        map.put(90,"XC");
        map.put(400,"CD");
        map.put(900,"CM");
        int a = 1;
        int b=0;
        int i=0;
        String s = String.valueOf(num);
        while(i<s.length()-1){
            i++;
            a*=10;
        }
        while(a>=1){
            b=num%a;
            int i1 = num / a;
            String s1 = map.get(i1 * a);
            if (s1==null){
                int j=0;
                if (i1>5){
                    j=i1-5;
                    stringBuilder.append(map.get(5*a));
                }else {
                    j=i1;
                }
                for (int i3=j;i3>0;i3-- ){
                    stringBuilder.append(map.get(a));
                }
            }else {
                stringBuilder.append(s1);
            }
num=b;
            a/=10;
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        LeetCode12 leetCode12 = new LeetCode12();
        System.out.println(leetCode12.intToRoman(1994));
    }
}
