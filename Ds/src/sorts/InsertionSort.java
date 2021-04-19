package Ds.src.sorts;

import java.util.Arrays;

public  class InsertionSort {

    public static int [] insertionSort(int [] a){
       for(int i=0;i<a.length;i++){
           int small=a[i];
           int j=i-1;
           while(j>=0 && a[j]>small){
               a[j+1]=a[j];
               j--;
           }
           a[j+1]=small;
       }
       return a;
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{7,8,5,2,4,6,3})));
    }
}