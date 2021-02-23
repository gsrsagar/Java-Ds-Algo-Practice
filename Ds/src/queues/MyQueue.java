package Ds.src.queues;
public class MyQueue{
    int maxSize;
    int front;
    int rear;
    long items[];
    int itemsSize;

    public MyQueue(int size){
        maxSize=size;
        front=0;
        rear=-1;
        items=new long[size];
    }
    public void insert(long value){
        if(!isFull()){
            addItem(value);
       }
       else{
           System.out.println("removed element= "+remove());
           addItem(value);
       }
    }

    public long peak(){
        return items[rear];
    }
    public void addItem(long value){
        items[++rear]=value;
        itemsSize++;
    }
    public long remove(){
        if(!isEmpty()){
            long temp=items[front];
            front++;
            itemsSize--;
            if(front>0 && rear!=0){
                for(int i=front;i<=itemsSize;i++){
                    items[i-1]=items[i];
                }
                front=0;
            }
        front=0;
        rear=itemsSize-1;
        return temp;
        }
        else System.out.println("QUeue is Empty"); return -1;
    }

    public void view(){
        if(!isEmpty()){
            System.out.print("[");
            for(int i=0;i<itemsSize;i++){
                System.out.print(items[i]+" ");
            }
            System.out.print("]");
        }
    }

    public boolean isEmpty(){
        return (rear==-1);
    }
    public boolean isFull(){
        return (rear==maxSize-1);
    }
}