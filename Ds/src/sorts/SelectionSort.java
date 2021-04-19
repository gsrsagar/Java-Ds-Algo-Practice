package Ds.src.sorts;

import java.sql.Array;
import java.util.Arrays;

public class SelectionSort {
    
    public static  int [] selectSort(int a []){
     for(int i=0;i<a.length;i++){
         int minimum=i;
         for(int j=i+1;j<a.length;j++){
             if(a[j]<a[minimum]){
                 minimum=j;
             }
         }
         int temp=a[minimum];
         a[minimum]=a[i];
         a[i]=temp;
     }
     return a;
}
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectSort(new int[]{7,8,5,2,4,6,3})));
    }
}
