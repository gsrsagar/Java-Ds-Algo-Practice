package Ds.src.sorts;

import java.util.Arrays;

public class BubbleSort {

    static int [] bubbleSort(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    array[j]=array[j]+array[j+1];
                    array[j+1]=array[j]-array[j+1];
                    array[j]=array[j]-array[j+1];
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{45,12,67,21,78,40})));
    }
}
