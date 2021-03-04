package Ds.src.trees;

/**
 * BST
 */
public class BST {

    private Node root;

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
                else{
                    current=current.rightChild;
                    if(current==null){
                        parent.rightChild=newNode;
                        return;
                    }
                }
            }
        }
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



