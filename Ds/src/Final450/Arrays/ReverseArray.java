package Ds.src.Final450.Arrays;

import java.util.Arrays;

public class ReverseArray {
    
    public static int [] reverseUsingLoop(int input[]){
        for(int i=0,j=input.length-1;i<input.length/2;i++,j--){
            input[i]=input[i]+input[j];
            input[j]=input[i]-input[j];
            input[i]=input[i]-input[j];
        }
        return input;
    }

    public static int[] reverseArray(int input[],int start,int end){
        if(start>=input.length/2){
            return input;
        }
        else{
            input[start]+=input[end];
            input[end]=input[start]-input[end];
            input[start]=input[start]-input[end];
            start++;
            end--;
            reverseArray(input, start, end);
        }
        return input;
    }

    public static int [] reverseArrayUsingRecursion(int input[]){
        return reverseArray(input,0,input.length-1);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseUsingLoop(new int[]{1,2,3,4,5,6,7,8,9,10,12})));
        System.out.println(Arrays.toString(reverseArrayUsingRecursion(new int[]{1,2,3,4,5,6,7,8,9,10,11,12})));
    }
}
