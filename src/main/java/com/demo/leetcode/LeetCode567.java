package com.demo.leetcode;

public class LeetCode567 {
    public boolean checkInclusion(String s1, String s2) {
        char[] chars = s1.toCharArray();
        char[] chars1 = s2.toCharArray();
        int int1[] = new int[26];
        int int2[] = new int[26];
        int i=0;
        int count1=0;
        while(i<chars.length){
            int1[chars[i]-'a']++;
            i++;
        }
        i=0;
        while(i<26){
            if (int1[i]>0){
                count1++;
            }
            i++;
        }
        int count2=0;
        int left=0;
        int right=0;
        while(right<chars1.length){
            if (int1[chars1[right]-'a']>0) {
                int2[chars1[right] - 'a']++;
                if (int2[chars1[right] - 'a'] == int1[chars1[right] - 'a']) {
                    count2++;
                }
            }
            right++;
            while(count1==count2){
                if (right-left==count1){
                    return true;
                }
                if (int1[chars1[left]-'a']>0) {
                    int2[chars1[left] - 'a']--;
                    if (int2[chars1[left] - 'a'] < int1[chars1[left] - 'a']) {
                        count2--;
                    }
                }
                left++;
            }
        }

return false;

    }

    public static void main(String[] args) {
        LeetCode567 leetCode567 = new LeetCode567();
        System.out.println(leetCode567.checkInclusion("adc","dcda"));
    }
}
