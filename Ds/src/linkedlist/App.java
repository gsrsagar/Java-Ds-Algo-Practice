package Ds.src.linkedlist;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
       CircularLinkedList d=new CircularLinkedList();
       d.insertFirst(30);
       d.insertFirst(40);
       d.insertFirst(50);
       d.insertFirst(60);
       d.insertFirst(70);
       System.out.println("Display Forward");
       System.out.println(d.getNLast(2).data);
       d.display();
       System.out.println(d.circleNode());
    //   MyLinkedList l = new MyLinkedList();
    //   l.insertFirst(30);
    //   l.insertFirst(40);
    //   l.insertFirst(50);
    //   l.insertFirst(60);

    //   l.display();
    //   System.out.println(l.midPoint().data);
      // d.insertBeforeKey(300,60);
     //  System.out.println("Display Forward");
     //  d.displayForward();
     //  d.insertAfterKey(400, 60);
      // System.out.println("Forward display");
      // d.displayForward();
    }
}
