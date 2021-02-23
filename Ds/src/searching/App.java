package Ds.src.searching;

public class App {
    public static void main(String[] args) {
        linear obj=new linear();
        long result=obj.linearSearch(new long []{1,2,3,4,5,9,23,},9);
        System.out.println("Return Index "+result);
        Binary obj1= new Binary();
        int result2=obj1.binarySearch(new long []{1,2,3,4,5,9,23,},4);
        System.out.println("Binary Search "+result2);
        int result3=obj1.binarySearchRecursive(new long []{1,2,3,4,5,9,23},0,6,9);
        System.out.println("Binary Search Recursive "+result3);
    }
}
