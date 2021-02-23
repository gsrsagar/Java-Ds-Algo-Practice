package Ds.src.linkedlist;

public class App {
    public static void main(String[] args) {
       DoublyLinkedList d=new DoublyLinkedList();
       d.insertFirst(30);
       d.insertFirst(40);
       d.insertFirst(50);
       d.insertLast(60);
       d.insertLast(70);
       System.out.println("Display Forward");
       d.displayForward();
       d.insertBeforeKey(300,60);
       System.out.println("Display Forward");
       d.displayForward();
       d.insertAfterKey(400, 60);
       System.out.println("Forward display");
       d.displayForward();
    }
}
