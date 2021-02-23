package Ds.src.searching;

public class Binary {

    public int binarySearch(long arr[], int input){
        int p,q,r;
        p=0;
        r=arr.length-1;
        while(p<=r){
            q=(p+r)/2;
            if(input<arr[q]) r=q-1;
            else if(input >arr[q]) p=q+1;
           else return q;
        }
        return -1;
    }
    
    public int binarySearchRecursive(long arr [], int p, int r,int x){
        if(p>r){
            return -1;
        }
        else{
            int q=(p+r)/2;
            if(x==arr[q]) return q;
            else if(x>arr[q]) return  binarySearchRecursive(arr, q+1, r, x);
            else return binarySearchRecursive(arr, p, q-1, x);
        }
    }
}
