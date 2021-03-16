package Ds.src.Day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseQueueTillKthElement {
    int front;
    int rear;
    int items[];
    int maxSize;
    int size;

    public ReverseQueueTillKthElement(int size){
        front=0;
        rear=-1;
        this.maxSize=size;
        this.size=0;
        items=new int[size];
    }

    public int insert(int data){
        if(!isFull()){
            addItem(data);
        }
        else{
            System.out.println("removed element -: "+remove());
            addItem(data);

        }
        return data;
    }
    public int addItem(int data){
            rear++;
            items[rear]=data; 
            size++;
            return data;
    }
    public int remove(){
        int temp=items[front];
        if(!isEmpty()){
            front++;
            if(front>0 && rear!=0){
                for(int i=front;i<size;i++){
                    items[i-1]=items[i];
                }
                front=0;
            }
            rear=size-1;
            front=0;
        }
        return temp;
    }

    public void reverseTillNthElements(int n){
        System.out.println("Iteams Before Remove element:- "+Arrays.toString(items));
        for(int i=0,j=n-1;i<n/2;i++,j--){
            int temp=items[i];
            items[i]=items[j];
            items[j]=temp;
        }
        System.out.println("Iteams After Remove element:- "+Arrays.toString(items));
    }
    public boolean isEmpty(){
        return rear==-1;
    }
    public boolean isFull(){
        return rear==maxSize-1;
    }
    
    public static void main(String[] args) {
        
        ReverseQueueTillKthElement queue= new ReverseQueueTillKthElement(10);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);
        queue.insert(90);
        queue.insert(100);
        queue.reverseTillNthElements(5);

    }

}
