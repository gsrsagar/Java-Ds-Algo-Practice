package Ds.src.Day3;

import java.util.Stack;

public class PrintCommonNodesIn_Two_BSTS {

    
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

    static void printCommon(TreeNode root1, TreeNode root2){       
        Stack<TreeNode> s1 = new Stack<TreeNode> ();  
        Stack<TreeNode> s2 = new Stack<TreeNode> (); 
       while(true){
           if(root1!=null){
               s1.push(root1);
                root1=root1.left;
           }
           else if(root2!=null){
               s2.push(root2);
               root2=root2.left;
           }
           else if(!s1.isEmpty() && !s2.isEmpty()){
               root1=s1.peek();
               root2=s2.peek();
               if(root1.key==root2.key){
                   s1.pop();
                   s2.pop();
                   System.out.print(root1.key+" ");
                   root1=root1.right;
                   root2=root2.right;
               }
               else if(root1.key<root2.key){
                   s1.pop();
                   root1=root1.right;
                   root2=null;
               }
               else if(root1.key>root2.key){
                   s2.pop();
                   root2=root2.right;
                   root1=null;
               }
           }
           else break;

       }  
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
    printCommon(root1, root2);

}
}
