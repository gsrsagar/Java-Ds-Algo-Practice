package Ds.src.DAA_Mock_Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {

    public  int [] rotateArray(int input[],int k){
        int result[]=new int[input.length];
        int index=0;
        for(int i=input.length-1-(input.length-1-k)+1;i<input.length;i++){
            result[index]=input[i];
            index++;
        }
        System.arraycopy(input, 0, result, 3, input.length-k);
        return result;
    }
    public static void main(String[] args) {
        RotateArray r= new RotateArray();
       System.out.println(Arrays.toString(r.rotateArray(new int[]{1,2,3,4,5,6,7}, 3))); 
    }
}
