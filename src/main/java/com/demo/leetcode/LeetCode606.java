package com.demo.leetcode;

/**
 * 根据二叉树创建字符串
 */
public class LeetCode606 {
    public String tree2str(TreeNode t) {
        StringBuilder s = new StringBuilder();
        if (t!=null) {
            s.append(t.val);
            if (t.left != null) {
                s.append("(");
                s.append(tree2str(t.left));
                s.append(")");
            }
            if (t.right != null) {
                s.append("(");
                s.append(tree2str(t.right));
                s.append(")");

            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        LeetCode606 a = new LeetCode606();
        TreeNode t = new TreeNode(1);
        t.left  = new TreeNode(2);
        t.right = new TreeNode(3);
        t.left.left = new TreeNode(4);
        t.right.right = new TreeNode(5);
        System.out.println(a.tree2str(t));
    }
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
