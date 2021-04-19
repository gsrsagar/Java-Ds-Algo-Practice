package Ds.src.Day3;

public class TreeNode {
         int key;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         
         TreeNode(int val) { this.key = val; }

         TreeNode(int val, TreeNode left, TreeNode right) {
             this.key = val;
             this.left = left;
             this.right = right;
         }
}