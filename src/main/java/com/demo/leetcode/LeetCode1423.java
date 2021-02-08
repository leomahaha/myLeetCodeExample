package com.demo.leetcode;

public class LeetCode1423 {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        int winSize=cardPoints.length-k;
        int winSum=0;
        int left=0;
        for(int i=0;i<winSize;i++){
            sum+=cardPoints[i];
        }
        winSum=sum;
        for(int i=winSize;i<cardPoints.length;i++){
            sum+=cardPoints[i];
            if(min>winSum){
                min=winSum;
            }
            winSum+=cardPoints[i];
            winSum-=cardPoints[left++];
        }
        if(min>winSum){
            min=winSum;
        }
        return sum-min;
    }


    public static void main(String[] args) {
        LeetCode1423 leetCode1423 = new LeetCode1423();
        int[] cardPoints={1,79,80,1,1,1,200,1};
        int k=3;
        System.out.println(leetCode1423.maxScore(cardPoints,k));
    }
}
