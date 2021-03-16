package Ds.src.Day2;

public class NthNodeFromEndOfLinkedList {
    static Node first=null;

    public  static int insert(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            first=newNode;
        }
        else{
            Node current=first;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
        return newNode.key;
   
    }

    static boolean isEmpty(){
        return (first==null);
    }

    static void display(){
        if(!isEmpty()){
            Node current=first;
            while(current!=null){
                System.out.print("["+first.key+"]");
                if(current.next!=null) System.out.print("->");
                current=current.next;
            }
            System.out.println();
        }
    }
    static Node nThFromLast(int n){
        Node slow=first;
        Node fast=first;
        if(!isEmpty()){
            while(n>0){
                fast=fast.next;
                n--;
            }
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
       insert(30);
       insert(40);
       insert(50);
       insert(60);
       insert(70);
       display();
       Node n=nThFromLast(2);
       System.out.println("n-thLast Node-> "+n.key);
        
    }
}
