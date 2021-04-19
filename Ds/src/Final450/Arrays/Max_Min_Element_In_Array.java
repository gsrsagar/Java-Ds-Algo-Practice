package Ds.src.Final450.Arrays;

import java.util.Arrays;

public class Max_Min_Element_In_Array {
    
    public static String maxAndMin(int input[]){
        int max=input[0];
        int min=input[0];
        for(int i=0,j=input.length-1;i<=input.length/2;i++,j--){
            min=min>input[i]?(input[i]>input[j]?input[j]:input[i]):(input[i]>input[j]?(input[j]<min?input[j]:min):(input[i]<min?input[i]:min));
            max=max<input[i]?input[i]<input[j]?input[j]:input[i]:input[i]<input[j]?input[j]>max?input[j]:max:input[i]>max?input[i]:max;
        }
        return min+" "+max;
    }
    public static void main(String args[]){
        System.out.println(Arrays.toString(maxAndMin(new int[]{0,12,56,1,56,99,23,21}).split(" ")));
    }
}
