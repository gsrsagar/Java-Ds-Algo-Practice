package Ds.src.heaps;

public class Application {
    public static void main(String[] args) {
        Heap hp=new Heap(10);
        hp.insert(6);
        hp.insert(7);
        hp.insert(13);
        hp.insert(11);
        hp.insert(23);
        hp.insert(41);
        hp.insert(62);
        hp.insert(69);
        hp.insert(72);
        hp.insert(90);
        hp.displayHeapArray();
        System.out.println("heap");
        System.out.println("level: "+hp.getLevel());
        hp.displayHeap();


    }
}
