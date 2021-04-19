package Ds.src.Final450.Arrays;

import java.util.Arrays;

public class MoveNegativeElementsInOneSideOfArray {

    public static int [] moveNegativeElementsOfArrayToOneSide(int input[]){
        int index=0;
        for(int i=0,j=input.length-1;i<=input.length/2;i++,j--){
            if(input[i]<0){
                swap(input, index, i);
                index++;
            } 
            if(input[j]<0){
                swap(input, index, j);
                index++;
            }
        }
        return input;
    }

    public static void swap(int input[],int index,int pos){
        int temp=input[index];
        input[index]=input[pos];
        input[pos]=temp;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveNegativeElementsOfArrayToOneSide(new int[]{1,-5,2,56,-9,12,-45,45,-23})));
    }
}
