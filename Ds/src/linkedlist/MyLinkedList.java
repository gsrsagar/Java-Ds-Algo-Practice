package Ds.src.linkedlist;

public class MyLinkedList {
    Node first=null;

    public boolean isEmpty(){
        return (first==null);
    }
    public void insertFirst(int data){
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=first;
        first=newNode;
    }
    public void insertLast(int data){
        Node current=first;
       while(current.next!=null){
           current=current.next;
       }
       Node newNode=new Node();
       newNode.data=data;
       current.next=newNode;
        
    }
    public Node deleteFirst(){
        Node temp=first;
        first=first.next;
        return temp;
    }
    public Node deleteLast(){
        Node temp=first;
        while(temp.next!=null){
            temp=temp.next;
        }

        return temp;
    }

    public void display(){
            Node current=null;
            current=first;
            while(current!=null){
                current.displayData();
                current=current.next;
        }
    }
}
