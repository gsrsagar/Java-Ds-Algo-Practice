package Ds.src.Day3;


import java.util.Stack;

public class LCA_BST {

    
    public static TreeNode insert(int key,TreeNode root){
        TreeNode newNode= new TreeNode(key);
        if(root==null) root=newNode;
        else{
            TreeNode current=root;
            TreeNode parent;
            while(true){
                parent=current;
                if(key<current.key){
                    current=current.left;
                    if(current==null){
                        parent.left=newNode;
                        break;
                    }
                }
                else {
                    current=current.right;
                    if(current==null){
                        parent.right=newNode;
                        break;
                    }
                }
            }
        }
        return root;
    }

    static void preOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        else{
            System.out.print(root.key+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    public static void postOrderTraversal(TreeNode root){
        if(root==null){
            return; 
        }
        else{
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.key+" ");
        }
    }
    static void startPreOrderTraversal(TreeNode root){
        preOrderTraversal(root);
        System.out.println();
    }
    static void startPostOrderTraversal(TreeNode root){
        postOrderTraversal(root);
        System.out.println();
    }

    static void inOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        else{
            inOrderTraversal(root.left);
            System.out.print(root.key+" ");
            inOrderTraversal(root.right);
        }
    }
    static void startInorderTraversal(TreeNode root){
        inOrderTraversal(root);
        System.out.println();
    }

    static TreeNode lca(TreeNode node, int n1, int n2)  
{ 
    if (node == null) 
        return null; 

    // If both n1 and n2 are smaller than root, then LCA lies in left 
    if (node.key > n1 && node.key > n2) 
        return lca(node.left, n1, n2); 

    // If both n1 and n2 are greater than root, then LCA lies in right 
    if (node.key < n1 && node.key < n2)  
        return lca(node.right, n1, n2); 

    return node; 
} 


public static void main(String[] args) {
    TreeNode root1 = null;  
    root1 = insert(5,root1);  
    root1 = insert(1,root1);  
    root1 = insert(10,root1);  
    root1 = insert(0,root1);  
    root1 = insert(4,root1);  
    root1 = insert(7,root1);  
    root1 = insert(9,root1);  
  
    // Create second tree as shown in example  
    TreeNode root2 = null;  
    root2 = insert(10,root2);  
    root2 = insert(7,root2);  
    root2 = insert(20,root2);  
    root2 = insert(4,root2);  
    root2 = insert(9,root2);
    startInorderTraversal(root1);
    startInorderTraversal(root2);
    System.out.println(lca(root1,4,10).key);
    
}

}
