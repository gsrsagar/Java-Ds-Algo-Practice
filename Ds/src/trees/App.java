package Ds.src.trees;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        BST bstree= new BST();
        bstree.insert(30, "Sagar");
        bstree.insert(20, "Guvvala");
        bstree.insert(35, "Reddy");
        bstree.insert(15, "Reddy");
        bstree.insert(14, "Reddy");
        bstree.insert(16, "Reddy");
        bstree.insert(17, "Reddy");
        bstree.insert(18, "Reddy");
        bstree.insert(19, "Reddy");
        bstree.insert(21, "Reddy");
        bstree.insert(32, "Reddy");
        bstree.insert(33, "Reddy");
        bstree.insert(34, "Reddy");
        bstree.insert(35, "Reddy");
        bstree.insert(36, "Reddy");


        System.out.println("BST "+ bstree.getRoot().key);
        System.out.println("min: "+bstree.findMin().key);
        System.out.println("max:"+bstree.findMax().key);
        System.out.println("deleted Node:"+bstree.remove((17)));
        System.out.println("minimum: "+bstree.findMin().key);
        System.out.println("level:"+bstree.getLevel());
        bstree.displayTree();

    }
}