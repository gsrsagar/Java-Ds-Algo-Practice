package Ds.src.linkedlist;

public class NodeDoubly {
    public int data;
    public NodeDoubly next;
    public NodeDoubly previous;

    public NodeDoubly(){
        next=null;
        previous=null;
    }
    public void diplsayNode(){
        System.out.println("{"+data+"}");
    }
}
