package Ds.src.linkedlist;

public class CircularLinkedList {
    private Node first=null;
    private Node last=null;

    public CircularLinkedList(){
        first=null;
        last=null;
    }
    public boolean isEmpty(){
        return (first==null);
    }
    public void insertFirst(int data){
       Node newNode=new Node();
       newNode.data=data;
       if(isEmpty()){
           last=newNode;
       }
       newNode.next=first;
       first=newNode;
    }
    public void insertLast(int data){
        Node newNode=new Node();
        newNode.data=data;
        if(isEmpty()){
            first=newNode;
        }
        else{
            last.next=newNode;
            last=newNode;
        }
        
    }
    public Node getNLast(int n){
        Node slow = this.first;
        Node fast = this.first;
        while(n>0){
            fast=fast.next;
            n--;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public Node deleteFirst(){
        Node temp=first;
        if(first.next==null){
            last=null;
        }
        first=first.next;
        return temp;
    }
    // public Node deleteLast(){
    //     Node temp=last;
        

    //     return temp;
    // }

    public void display(){
            Node current=null;
            current=first;
            while(current!=null){
                current.displayData();
                current=current.next;
        }
    }

    public boolean circleNode(){
        Node slow=this.first;
        Node fast=this.first;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
