package Ds.src.Day1;

import java.util.Arrays;

public class Arraychunk {
    
    public int [][] chunckArray(int array[], int size){
        int chunckArray[][]=new int[array.length%size][size];
        int index=0;
        int last []=new int[size];
        last=chunckArray[0];
        int lastindexPresent=0;
        for(int i=0;i<array.length;i++){
            if(last.length==0 || (last.length==size && last[last.length-1]>0)){
                if(last.length==size) {
                  //  chunckArray[chunckArray.length]=last;
                    index=0;
                    lastindexPresent++;
                    last=chunckArray[lastindexPresent];
                    last[index]=array[i];
                    index++;
                }
                else{
                    last[index]=array[i];
                    index++;
                }
            }
            else{
                last[index]=array[i];
                index++;
            }
        }
        return chunckArray;
    }

    public  int[][] ArrayChunk(int[] array, int chunkSize) {
        int size=(int)Math.ceil((double) array.length/chunkSize);
        int output[][] = new int [size][];
        for(int i=0;i<size;i++){
            int start=i*size;
            int length =Math.min(array.length-start, size);
            int arr[]=new int[length];
            System.arraycopy(array, start, arr, 0, length);
            output[i]=arr;
        } 

        //
        return output;
    }
public  int[][] splitArray(int[] arrayToSplit, int chunkSize){
    if(chunkSize<=0){
        return null;  // just in case :)
    }
    // first we have to check if the array can be split in multiple 
    // arrays of equal 'chunk' size
    int rest = arrayToSplit.length % chunkSize;  // if rest>0 then our last array will have less elements than the others 
    // then we check in how many arrays we can split our input array
    int chunks = arrayToSplit.length / chunkSize + (rest > 0 ? 1 : 0); // we may have to add an additional array for the 'rest'
    // now we know how many arrays we need and create our result array
    int[][] arrays = new int[chunks][];
    // we create our resulting arrays by copying the corresponding 
    // part from the input array. If we have a rest (rest>0), then
    // the last array will have less elements than the others. This 
    // needs to be handled separately, so we iterate 1 times less.
    for(int i = 0; i < (rest > 0 ? chunks - 1 : chunks); i++){
        // this copies 'chunk' times 'chunkSize' elements into a new array
        arrays[i] = Arrays.copyOfRange(arrayToSplit, i * chunkSize, i * chunkSize + chunkSize);
    }
    if(rest > 0){ // only when we have a rest
        // we copy the remaining elements into the last chunk
        arrays[chunks - 1] = Arrays.copyOfRange(arrayToSplit, (chunks - 1) * chunkSize, (chunks - 1) * chunkSize + rest);
    }
    return arrays; // that's it
}
}