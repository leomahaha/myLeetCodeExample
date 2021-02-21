package com.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode119 {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> list1=new ArrayList<>();
        for (int i=0;i<=rowIndex;i++){
            List<Integer> list = new ArrayList<>();
            for (int j=0;j<i+1;j++){
                if (j==0||j==i){
                    list.add(1);
                }else {
                    list.add(list1.get(j)+list1.get(j-1));
                }
            }
            list1=list;
        }
        return list1;
    }

    public static void main(String[] args) {
        LeetCode119 leetCode119 = new LeetCode119();
        List<Integer> row = leetCode119.getRow(4);
        System.out.println(row);
    }
}

