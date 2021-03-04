package Ds.src;

import java.util.Arrays;

import Ds.src.sorts.QuickSort;

public class App {
    public static void main(String[] args) {
        int arr[]={34,1,3,56,23,134,65,24,67,92,23};
        QuickSort q= new QuickSort();
        q.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
