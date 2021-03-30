package com.demo.leetcode;

public class LeetCode74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int length = matrix.length;
        int length1 = matrix[0].length;
        if (length==0||length==0){
            return false;
        }
        int a=-1;
        for (int i=1;i<length;i++){
            if (target>=matrix[i-1][0]&&target<=matrix[i][0]){
                if (target==matrix[i-1][0]) return true;
                if (target==matrix[i][0])return  true;
                a=i-1;
            }
        }
        if (matrix[length-1][0]<target){
            a=length-1;
        }
        if (length==1) a=0;
        if (a==-1) return false;
        for (int j=0;j<length1;j++){
            if (target==matrix[a][j]){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        LeetCode74 leetCode74 = new LeetCode74();
        int[][]matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//        int[][]matrix = {{1},{3}};
        int target = 30;
        boolean b = leetCode74.searchMatrix(matrix, target);
        System.out.println(b);
    }
}
