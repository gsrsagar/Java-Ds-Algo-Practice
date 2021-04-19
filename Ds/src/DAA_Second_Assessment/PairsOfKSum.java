package Ds.src.DAA_Second_Assessment;

import java.util.Arrays;

public class PairsOfKSum {

    static String[] pairsOfKSumFromArray(int input[],int Sum){
        String result[]=new String[(int)Math.ceil((double)(input.length/2))];
        int sum=Sum;
        int left=input[0];
        int index=0;
        for(int i=0;i<input.length;i++){
            left=input[i];
            for(int j=i+1;j<input.length;j++){
                int right=input[j];
                if(Sum==left+right){
                    result[index]=left+"+"+right+"="+Sum;
                    index++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String result[]=pairsOfKSumFromArray(new int[]{2,4,5,6,3,9,2,7,1}, 5);
        for(String s:result){
            if(s!=null) System.out.println(s);
        }
    }
}
