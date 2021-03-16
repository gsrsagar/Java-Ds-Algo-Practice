package Ds.src.Day2;
import java.util.Arrays;

public class QueueReversalUsingRecursion {

    int front;
    int rear;
    int items[];
    int maxSize;
    int size;

    public QueueReversalUsingRecursion(int size){
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

    public void reverseQueue(){
        System.out.println("Before Reverse"+Arrays.toString(items));
        int arr[]=reverse(items, items.length/2,0,1);
        System.out.println("After Reverse "+Arrays.toString(arr));
    }
    public int [] reverse(int [] items, int n,int start,int counter){
        if(n==start){
            return items;
        }
        else{
            for(int i=start;i<n && counter<=1;i++){
                int temp=items[i];
                items[i]=items[items.length-i-1];
                items[items.length-i-1]=temp;
                items=reverse(items,n,++i,1);
                counter++;
            }
        }
        return items;
    }
    public boolean isEmpty(){
        return rear==-1;
    }
    public boolean isFull(){
        return rear==maxSize-1;
    }
    public void display(){
        System.out.println(Arrays.toString(items));
    }
    
    public static void main(String[] args) {
        
        QueueReversalUsingRecursion queue= new QueueReversalUsingRecursion(10);
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
        queue.display();
        queue.reverseQueue();

    }

}
   
