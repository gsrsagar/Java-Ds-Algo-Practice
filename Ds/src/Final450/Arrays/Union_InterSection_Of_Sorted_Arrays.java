package Ds.src.Final450.Arrays;

import java.util.Arrays;

public class Union_InterSection_Of_Sorted_Arrays {

    public static String [] unionAndIntersectionOfSortedArrays(int input1[],int input2[]){
        StringBuilder unionResult= new StringBuilder(" ");
        StringBuilder intersectionResult= new StringBuilder(" ");
        int greater=input2.length>input1.length?1:2;
        int len=Math.abs(input1.length-input2.length);
        int maxLength=input1.length>input2.length?input1.length:input2.length;
        for(int i=0;i<maxLength-len;i++){
            unionResult.append(input1[i]+" ");
            intersectionResult.append(input2[i]+" ");
            for(int k=0,m=input2.length-1;k<input2.length/2;k++,m--){
                if(input1[i]==input2[k] || input1[i]==input2[m]) intersectionResult.append(input1[i]+" ");
            }
        }
        
        if(greater==1){
            unionResult.append(Arrays.copyOfRange(input1, input1.length-(input1.length-len), input1.length));
        }
        if(greater==2){
            unionResult.append(Arrays.copyOfRange(input2, input2.length-(input2.length-len), input2.length));
        }
        unionResult.deleteCharAt(unionResult.length()-1);
        intersectionResult.deleteCharAt(intersectionResult.length()-1);

        return new String []{unionResult.toString(),intersectionResult.toString()};
    }
    
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(unionAndIntersectionOfSortedArrays(new int[]{1,2,3,4,5,6,7}, new int[]{1,2,3,9,8,10})));
    }
}
