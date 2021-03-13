package Ds.src.trees;

import java.util.Stack;

import javax.print.event.PrintEvent;

/**
 * BST
 */
public class BST {
    private Node root;

    public int getLevel(){
        Node current=root;
        int level=0;
        while(current!=null){
            level++;
            current=current.leftChild;
        }
        return level;
    }

    public void printSpaces(int spaces){
        for(int i=0;i<spaces;i++){
            System.out.print(' ');
        }
    }
    
    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int size=(int)Math.pow(2, (double)this.getLevel());
        int nBlanks =size*2;
        boolean isRowEmpty = false;
        System.out.println("......................................................");
        
        while(isRowEmpty==false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for(int j=0; j<nBlanks; j++) {
                System.out.print(" ");
            }
                
            while(globalStack.isEmpty()==false) {
                Node temp = (Node)globalStack.pop(); 
                if(temp != null) {
                    System.out.print(temp.key); 
                    localStack.push(temp.leftChild); 
                    localStack.push(temp.rightChild);
                    if(temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false; 
                    }
                } else {
                    System.out.print("--"); 
                    localStack.push(null); 
                    localStack.push(null);
                }
                
                for(int j=0; j<nBlanks*2-2; j++) {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
            nBlanks = nBlanks/2;
            
            while(localStack.isEmpty()==false)
                globalStack.push( localStack.pop() ); 
            }
        System.out.println( "......................................................");
 
 }
       


    public void insert(int key, String value){
        Node newNode= new Node(key,value);
        if(root==null) root=newNode;
        else{
            Node current=root;
            Node parent;
            while(true){
                parent=current;
                if(key<current.key){
                    current=current.leftChild;
                    if(current==null){
                        parent.leftChild=newNode;
                        return;
                    }
                }
                else {
                    current=current.rightChild;
                    if(current==null){
                        parent.rightChild=newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean remove(int key){
        Node currentNode=root;
        Node parentNode=root;
        boolean isLeftChild=false;
        //searching node with key to delete 
        while(currentNode.key!=key){
            parentNode=currentNode;
            if(key<currentNode.key){
                isLeftChild=true;
                currentNode=currentNode.leftChild;
            }
            else{
                isLeftChild=false;
                currentNode=currentNode.rightChild;
            }
            if(currentNode==null){
                return false;
            }
        }

        //found the node
        Node nodeToDelete=currentNode;

        //If leaf node
        if(nodeToDelete.leftChild==null && nodeToDelete.rightChild==null){
            if(nodeToDelete==root){
                root=null;
            }
            else if(isLeftChild){
                parentNode.leftChild=null;
            }
            else{
                parentNode.rightChild=null;
            }
        }

        //If Node has one child and that is on to the left

        else if(nodeToDelete.rightChild==null){
            if(nodeToDelete==root){
                root=nodeToDelete.leftChild;
            }
            else if(isLeftChild){
                parentNode.leftChild=nodeToDelete.leftChild;
            }
            else{
                parentNode.rightChild=nodeToDelete.leftChild;
            }
        }
        // If node has one chuld and that is on to the right

        else if(nodeToDelete.leftChild==null){
            if(nodeToDelete==root){
                root=nodeToDelete.rightChild;
            }
            else if(isLeftChild){
                parentNode.leftChild=nodeToDelete.leftChild;
            }
            else{
                parentNode.rightChild=nodeToDelete.rightChild;
            }
        }

        //If node has two children(tricky)
        else{
            Node successor = getSuccessor(nodeToDelete);
            if(nodeToDelete==root){
                root=successor;
            }else if(isLeftChild){
                parentNode.leftChild=successor;
            }else{
                parentNode.rightChild=successor;
            }
            successor.leftChild=nodeToDelete.leftChild;
        }

        return true;
    }

    public Node getSuccessor(Node nodeToDelete){
        Node successorParent=nodeToDelete;
        Node successor=nodeToDelete;
        Node current=nodeToDelete.rightChild;  //got the right child

        //To find the last left child of nodetoDelete
        while(current!=null){
            successorParent=successor;
            successor=current;
            current=current.leftChild;
        }
        // If successor is not a right child
        if(successor!=nodeToDelete.rightChild){
            successorParent.leftChild=successor.rightChild;
            successor.rightChild=nodeToDelete.rightChild;
        }
        return successor;
    }
    public String toStringInOrder(Node root){
        String s="";
        if(root==null){
            return "";
        }
        else{
            s+=toStringInOrder(root.leftChild);
            s+=root.toString();
            s+=toStringInOrder(root.rightChild);
            return s;
        }

    }


    public Node getRoot(){
        return root;
    }

    public Node findMin(){
        Node current=root;
        Node last=null;
        while(current!=null){
            last=current;
            current=current.leftChild;
        }
        return last;
    }

    public Node findMax(){
        Node current=root;
        Node last=null;
        while(current!=null){
            last=current;
            current=current.rightChild;
        }
        return last;
    }
}



