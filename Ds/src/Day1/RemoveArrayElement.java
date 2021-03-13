package Ds.src.Day1;

import java.util.Arrays;

public class RemoveArrayElement {

    static int [] removeArrayElement(int arr[],int index){
        for(int i=index;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        } 
        return Arrays.copyOfRange(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeArrayElement(new int[]{1,2,3,4,5}, 2)));
    }
}
