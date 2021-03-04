package Ds.src.sorts;

import java.util.Arrays;

public class QuickSort{

    public void quickSort(int a[], int start, int end){
        if(start<end){
            int part= partition(a,start,end);
            quickSort(a,start,part-1);
            quickSort(a,part+1,end);
        }
        
    }

    public int partition(int a[] ,int  start ,int end){
        int pivot= a[end];
        int i=start-1;
        for(int j=start;j<=end-1;j++){
            if(a[j]<pivot){
                i++;
                int sval=a[i];
                int jval=a[j];
                a[i]=jval;
                a[j]=sval;
            }
        }
        int  temp =a[i+1];
        a[i+1]=pivot;
        a[end]=temp;
        return i+1;
    }
}