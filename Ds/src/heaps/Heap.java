package Ds.src.heaps;

import java.util.Arrays;

/**
 * Heap
 */
public class Heap {

    private Node heaparray[];
    private int maxSize;
    private int currentSize;

    public Heap(int size){
        this.maxSize=size;
        heaparray= new Node[size];
        currentSize=0;
    }

    public boolean isEmpty(){
        return (this.currentSize==0);
    }
    public int getSize(){
        return currentSize;
    }
    public boolean insert(int key){
        if(currentSize==maxSize){
            return false;
        }
        Node newNode= new Node(key);
        heaparray[currentSize]=newNode;
        trickleUp(currentSize);
        currentSize++;
        return true;
    }

    public void trickleUp(int index){
        int parentIndex=(index-1)/2;
        Node currentNode=heaparray[index];

        while(index>0 && heaparray[index].getKey()<currentNode.getKey()){
            heaparray[index]=heaparray[parentIndex];
            index=parentIndex;
            parentIndex=(parentIndex-1)/2;
        }
        heaparray[index]=currentNode;
    }

    public Node remove(){
        Node root=heaparray[0];
        currentSize--;
        heaparray[0]=heaparray[currentSize];
        trickleDown(0);
        return root;
    }
    public void trickleDown(int idx){
        int largeChildindx;
        Node top=heaparray[idx]; //save last into top varibale
        //will run as long as idx is not on the bottom row(at least 1 child)
        while(idx<currentSize/2){
            int leftChild=2*idx+1;
            int rightChiled=2*idx+2;
            if(rightChiled<currentSize && heaparray[leftChild].getKey() <heaparray[rightChiled].getKey()){
                largeChildindx=rightChiled;
            }else{
                largeChildindx=leftChild;
            }
            if(top.getKey()>=heaparray[largeChildindx].getKey()){
                break; //successfully root node has large key
            }
            heaparray[idx]=heaparray[largeChildindx];
            idx=largeChildindx; // go deown
        }
        heaparray[idx]=top;
    }

    public int getLevel(){
        int level=1;
        int index=0;
        Node root=heaparray[index];
       int leftIndex=(2*index)+1;
       int rightindex=(2*index)+2;
        while((leftIndex<=maxSize || rightindex<=maxSize) && (heaparray[leftIndex]!=null || heaparray[rightindex]!=null)){
            level++;
            leftIndex=(2*leftIndex)+1;
            rightindex=(2*rightindex)+2;
        }
        return level;
    }

    public void displayHeap() {
        for(int i = 0; i < currentSize; i++) {
            if(heaparray[i] != null) {
                System.out.print( heaparray[i].getKey() + " ");
            }
            System.out.println();
            
            int spaces = (int)Math.pow(2,(double)(getLevel()))*2;
            int itemsPerRow = 1;
            int column = 0;
            int j = 0; // current item
            
            String line = "...............................";
            System.out.println(line+line);
            while(currentSize > 0) {
                if(column == 0) {
                    for(int k = 0; k < spaces; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.print(heaparray[j].getKey());
                j++;
                if(j == currentSize) {
                    break;
                }
                
                column++;
                // end of row
                if(column == itemsPerRow) {
                    spaces = spaces/2; // half the blanks
                    itemsPerRow = itemsPerRow * 2;     // twice the items
                    column = 0;
                    System.out.println();
                } else {
                    for(int k=0; k<spaces*2; k++) {
                        System.out.print(" ");
                    }
                }
                    
            }
            System.out.println("\n"+line+line);
        }
        
        
    }
    public void printHeap(){
         Node root=heaparray[0];
         int spaces=getLevel()*2;

    }

    public void displayHeapArray(){
        for(int i=0;i<heaparray.length;i++){
            System.out.print(heaparray[i].getKey()+" ");
        }
    }
}