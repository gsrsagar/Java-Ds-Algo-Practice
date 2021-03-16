package Ds.src.Day2;

import java.util.Arrays;
import java.util.HashMap;

public class HighFive {

    public int [][] highFive(int arr[][]){
        int result [][]=new int[2][2];
        int index=0;
        HashMap<Integer,Integer> scoreCount = new HashMap<>();
        HashMap<Integer,Integer> minNum= new HashMap<>();
        HashMap<Integer,Integer> hMap= new HashMap<>();
        for(int i=0,j=0;i<arr.length;i++){
            if(hMap.containsKey(arr[i][j])){
                scoreCount.put(arr[i][j],scoreCount.get(arr[i][j])+1);
                int indx=hMap.get(arr[i][j]);
                if(result[indx][j]==arr[i][j]){
                    result[indx][1]=(result[indx][1]+arr[i][j+1]);
                    if(minNum.containsKey(arr[i][j])){
                        if(minNum.get(arr[i][j])>arr[i][j+1]){
                            minNum.put(arr[i][j],arr[i][j+1]);
                        }
                    }

                }
            }
            else{
                scoreCount.put(arr[i][j],1);
                minNum.put(arr[i][j],arr[i][j+1]);
                hMap.put(arr[i][0], index);
                result[index][j]=arr[i][j];
                result[index][j+1]=arr[i][j+1];
                index++;
            }
        }
        for(int [] array:result){
            if(scoreCount.get(array[0])>5) array[1]=(array[1]-minNum.get(array[0]));
            array[1]=array[1]/5;
        }

        return result;
    }
    public static void main(String[] args) {
       HighFive h=new HighFive();
      // int arr[][]=h.highFive(new int [][]{{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}});
       int arr[][]=h.highFive(new int [][]{{1,100},{7,100},{1,100},{7,100},{1,100},{1,100},{7,100},{7,100},{1,100},{7,100}});
        for(int [] array:arr){
            System.out.println(Arrays.toString(array));
        }
    }
}
