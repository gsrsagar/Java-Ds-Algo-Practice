package Ds.src.Day3;

public class Check_all_leafs_are_at_same_level {

      
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

    
    static boolean checkUtil(TreeNode node, int level, int leafLevel) 
    {
        // Base case
        if (node == null)
            return true;
             
        // If a leaf node is encountered
        if (node.left == null && node.right == null) 
        {
            // When a leaf node is found first time
            if (leafLevel == 0) 
            {
                // Set first found leaf's level
                leafLevel= level; 
                return true;
            }
  
            // If this is not first leaf node, compare its level with
            // first leaf's level
            return (level == leafLevel);
        }
  
        // If this node is not leaf, recursively check left and right 
        // subtrees
        return checkUtil(node.left, level + 1, leafLevel)
                && checkUtil(node.right, level + 1, leafLevel);
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
    static boolean check(TreeNode node) {
        int level = 0;
        return checkUtil(node, level,0);
    }
    public static void main(String[] args) {
        TreeNode root2 = new TreeNode(); 
        TreeNode newNode = new TreeNode();  
        root2.key=12;
        newNode.key=5;
        root2.left=newNode;
        newNode.key=3;
        root2.left.left=newNode;
        newNode.key=7;
        root2.right=newNode;   
        startInorderTraversal(root2);
        System.out.println(check(root2));
    }
}
