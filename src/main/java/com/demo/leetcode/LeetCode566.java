package com.demo.leetcode;

public class LeetCode566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int length = nums.length;
        if (length>0) {
            int length1 = nums[0].length;
            int i = length * length1;
            if (r*c!=i){
                return nums;
            }
            int[][] ints=new int[r][c];
            int p=0,q=0;
            for (int k=0;k<length;k++){
                for (int j=0;j<length1;j++){
                    ints[p][q]=nums[k][j];
                    q++;
                    if (q==c){
                        p++;
                        q=0;
                    }
                }
            }
            return ints;
        }
        return nums;
    }

    public static void main(String[] args) {
        LeetCode566 leetCode566=new LeetCode566();
        int[][] ints = leetCode566.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4);
        System.out.println(ints);
    }
}
