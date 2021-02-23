package Ds.src.queues;

public class Main {
    public static void main(String[] args) {
        System.out.println("Set QUeue Size");
        MyQueue queue=new MyQueue(5);
       queue.insert(10);
       queue.insert(20);
       queue.insert(30);
       queue.insert(40);
       queue.insert(50);
       queue.view();
       queue.insert(60);
       queue.insert(70);
       queue.insert(80);
       queue.insert(90);

       queue.insert(100);
       queue.insert(110);
       System.out.println( queue.peak());
       queue.view();
    }
} 
