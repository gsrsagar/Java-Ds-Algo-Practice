package Ds.src.trees;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        BST bstree= new BST();
        bstree.insert(1, "Sagar");
        bstree.insert(2, "Guvvala");
        bstree.insert(3, "Reddy");
        System.out.println("BST "+ bstree.getRoot().key);
        System.out.println("min: "+bstree.findMin().key);
        System.out.println("max:"+bstree.findMax().key);
    } 

}