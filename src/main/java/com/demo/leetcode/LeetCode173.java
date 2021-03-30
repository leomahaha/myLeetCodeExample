package com.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode173 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }
  }
    class BSTIterator {
        List<Integer> list=new ArrayList<>();
        int i=0;
        public BSTIterator(TreeNode root) {
           diguileft(root,list);

        }

        public int next() {
            return list.get(i++);
        }

        public boolean hasNext() {
            return (i+1)<=list.size();
        }
        TreeNode diguileft(TreeNode root,List<Integer> list){
            TreeNode treeNode=root;
            if (root.left!=null){
                root=root.left;
                diguileft(root,list);
            }
            list.add(treeNode.val);
            if (treeNode.right!=null){
                treeNode=treeNode.right;
                diguileft(treeNode,list);
            }
            return treeNode;
        }

    }

    public static void main(String[] args) {
        LeetCode173 leetCode173 = new LeetCode173();
        TreeNode treeNode=leetCode173.new TreeNode();
        treeNode.val=7;
        TreeNode treeNode1=leetCode173.new TreeNode();
        treeNode1.val=3;
        TreeNode treeNode2=leetCode173.new TreeNode();
        treeNode2.val=15;
        TreeNode treeNode3=leetCode173.new TreeNode();
        treeNode3.val=20;
        TreeNode treeNode4=leetCode173.new TreeNode();
        treeNode4.val=9;
        treeNode2.left=treeNode4;
        treeNode2.right=treeNode3;
        treeNode.left=treeNode1;
        treeNode.right=treeNode2;
        BSTIterator bSTIterator = leetCode173.new BSTIterator(treeNode);
        System.out.println(bSTIterator.next() );   // 返回 3
        System.out.println(bSTIterator.next());   // 返回 7
        System.out.println(bSTIterator.hasNext()); // 返回 True
        System.out.println(bSTIterator.next());   // 返回 9
        System.out.println(bSTIterator.hasNext()); // 返回 True
        System.out.println(bSTIterator.next());   // 返回 15
        System.out.println(bSTIterator.hasNext());// 返回 True
        System.out.println(bSTIterator.next());   // 返回 20
        System.out.println(bSTIterator.hasNext());// 返回 False


    }
}
