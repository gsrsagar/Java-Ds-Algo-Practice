package Ds.src.Final450.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KthMaxELement_MinElement {

    public static int partition(int input[],int start, int end){
        int pivot=input[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(input[j]<pivot){
                i++;
                int sval=input[i];
                int jval=input[j];
                input[i]=jval;
                input[j]=sval;
            }
        }
        int temp=input[i+1];
        input[i+1]=pivot;
        input[end]=temp;
        return i+1;
    }

    public static void quickSort(int input[],int start, int end){
        if(start<end){
            int part=partition(input,start,end);
            quickSort(input,start,part-1);
            quickSort(input, part+1, end);
        }
    }

    public static String kthMaxAndMin(int input[], int k){
        quickSort(input, 0, input.length-1);
        int len=input.length;
        System.out.println(Arrays.toString(input));
        return input[0]+" "+input[len-k];
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(kthMaxAndMin(new int[]{23,1,3,5,2,78,34,99}, 3).split(" ")));
    }
}
