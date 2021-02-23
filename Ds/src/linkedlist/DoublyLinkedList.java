package Ds.src.linkedlist;


public class DoublyLinkedList {
    public NodeDoubly first;
    public NodeDoubly last;

    public DoublyLinkedList(){
        first=null;
        last=null;
    }

    public boolean isEmpty(){
        return (first==null);
    }
    public void insertFirst(int data){
        NodeDoubly newNode=new NodeDoubly();
        newNode.data=data;
        if(isEmpty()){
            last=newNode;
        }
        else{
            first.previous=newNode;
        }
        newNode.next=first;
        first=newNode;
    }
    public void insertLast(int data){
        NodeDoubly newNode=new NodeDoubly();
        newNode.data=data;
        if(isEmpty()){
            first=newNode;
        }
        else{
           last.next=newNode;
           newNode.previous=last;
        }
        last=newNode;
    }
    public NodeDoubly deleteFirst(){
        NodeDoubly temp=new NodeDoubly();
        temp=first;
        if(first.next==null){
            last=null;
        }
        else{
            first.next.previous=null;
        }
        first=first.next;
        return temp;
    }
    public NodeDoubly deleteLast(){
        NodeDoubly temp=new NodeDoubly();
        temp=last;
        if(last.next==null){
            first=null;
        }
        else{
            last.previous.next=null;
        }
        last=last.previous;
        return temp;
    }

    public void displayForward(){
        NodeDoubly current=new NodeDoubly();
        current=first;
        while(current!=null){
            current.diplsayNode();
            current=current.next;
        }
    }
    public void displayBackward(){
        NodeDoubly current=new NodeDoubly();
        current=last;
        while(current!=null){
            current.diplsayNode();
            current=current.previous;
        }
    }
    // public boolean insertAtKey(int data, int key){
    //     NodeDoubly newNode=new NodeDoubly();
    //     newNode.data=data;
    //     NodeDoubly current=first;
    //     while(key!=current.data){
    //         current=current.next;
    //         if(current==null){
    //             return false;
    //         }
    //     }
    //     if(current==last){
    //         current.next=null;
    //         last=newNode;
    //     }
    //     else{
    //         newNode.next=current.next;
    //         current.next.previous=newNode;
    //     }
    //     newNode.previous=current;
    //     current.next=newNode;
        
    // return true;
    // }

















    public boolean insertAfterKey(int data, int key){
        NodeDoubly newNode=new NodeDoubly();
        newNode.data=data;
        NodeDoubly current=first;
        while(current.data!=key){
            current=current.next;
            if(current==null){
                return false;
            }
        }
        if(current==last){
            current.next=null;
            last=newNode;
        }
        else{
            newNode.next=current.next;
            current.next.previous=newNode;
        }
        current.next=newNode;
        newNode.previous=current;
        return true;
    }

    public boolean insertBeforeKey(int data, int key){
        NodeDoubly newNode=new NodeDoubly();
        newNode.data=data;
        NodeDoubly current= new NodeDoubly();
        current=first;
        while(current.data!=key){
            current=current.next;
            if(current==null){
                return false;
            }
        }
        System.out.println("current.data"+current.data);
        newNode.previous=current.previous;
        current.previous.next=newNode;
        newNode.next=current;
        current.previous=newNode;
        return true;
    }
}
