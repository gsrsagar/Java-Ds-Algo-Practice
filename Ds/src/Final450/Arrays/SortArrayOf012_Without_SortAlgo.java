package Ds.src.Final450.Arrays;
import java.util.Arrays;

public class SortArrayOf012_Without_SortAlgo {

    public static int [] sortArrayWithOutSortAlgorithm(int input []){
        int values[]=new int[3];
        for(int i=0,j=input.length-1;i<input.length/2;i++,j--){
            values[input[i]]++;
            values[input[j]]++;
        }
        int index=0;
        for(int k=0;k<values.length;k++){
            for(int i=0;i<values[k];i++,index++) input[index]=k;
        }
        return input;
    }
    public static void main(String[] args) {
       System.out.println(Arrays.toString(sortArrayWithOutSortAlgorithm(new int[]{0,1,2,2,2,1,1,0,0,1}))); 
    }
}
