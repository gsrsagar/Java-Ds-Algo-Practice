package Ds.src.DAA_Mock_Practice;


public class DetectCycleInLinkedList {
    
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
    static String circle(int value,int next){
        insert(value);
        Node current=first;
        Node nextNode=first;
        int index=0;
        while(next!=-1 && current.next!=null){
            if(index==next) nextNode=current;
            else index++;
            current=current.next;
        }
        current.next=nextNode;

        if(next==-1) return ("There Is no cycle in the linked list");
        else if(index>=0 && nextNode!=null) return ("There Is a cycle in the linked list, where tail connects to  "+next+"st"+" Node");
        else return "";
    }
    static String linkedListOperations(int arr[],int pointer){
        String result="";
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
            if(i==arr.length-1) {
               result= circle(arr[i], pointer);
            }
        }
        return result;  
    }
    public static void main(String[] args) {
        System.out.println(linkedListOperations(new int[]{1,4,6,8}, -1));
    }
}
