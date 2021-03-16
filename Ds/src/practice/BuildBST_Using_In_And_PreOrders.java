/** 
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode() {}
*     TreeNode(int val) { this.val = val; }
*     TreeNode(int val, TreeNode left, TreeNode right) {
*         this.val = val;
*         this.left = left;
*         this.right = right;
*     }
* }
*/

package Ds.src.practice;

import java.util.Arrays;

class BuildBST_Using_In_And_PreOrders {
   public TreeNode buildTree(int[] preorder, int[] inorder) {
       return buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
   }

   public TreeNode buildTree(int[] preorder, int startIn, int endIn, int[] inorder, int startPre, int endPre) {
       if (startIn > endIn || startPre > endPre) return null;
       TreeNode root = new TreeNode(preorder[startIn]);
       
       //find number of remaining nodes of the left branch and the right branch
       int index = startPre; // i is index of the root in the inorder array
       while (index < endPre && inorder[index] != preorder[startPre]) index++;
       int leftChildren = index - startPre; // number of remaining nodes of the left branch
       int rightChildren = endPre - index; // number of remaining nodes of the righ branch
       
       root.left = buildTree(preorder, startIn + 1, startIn + leftChildren, inorder, startPre, index - 1);
       root.right = buildTree(preorder, startIn + leftChildren + 1, startIn + leftChildren + 1 + rightChildren, inorder, index + 1, endPre);
       return root;
   }

   public static void main(String[] args) {
       BuildBST_Using_In_And_PreOrders node = new BuildBST_Using_In_And_PreOrders();
       Object o=node.buildTree(new int[]{4,2,1,7,5,8,3,6},new int[]{1,2,4,3,5,7,8,6});
       System.out.println(String.valueOf(node.buildTree(new int[]{4,2,1,7,5,8,3,6},new int[]{1,2,4,3,5,7,8,6})));
   }
}

