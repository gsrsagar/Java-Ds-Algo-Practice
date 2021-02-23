package Ds.src.sorts;

public class SelectionSort {
    
    public int [] selectSort(int a []){
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
}
