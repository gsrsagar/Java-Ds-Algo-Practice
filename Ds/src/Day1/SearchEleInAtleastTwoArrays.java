package Ds.src.Day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SearchEleInAtleastTwoArrays {

    static Object[] searchEleAtleastTwoArrays(int arr [],int arr2 [], int arr3 []){
        HashSet<Integer> result= new HashSet<>();
        int size=arr.length+arr2.length+arr3.length;
        int array[]=new int[size];
        System.arraycopy(arr, 0, array, 0, arr.length);
        System.arraycopy(arr2, 0, array, arr.length, arr2.length);
        System.arraycopy(arr3, 0, array, arr.length+arr2.length,arr3.length);
        HashMap<Integer,Integer> hMap =new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(hMap.containsKey(array[i])){
                hMap.put(array[i],hMap.get(array[i])+1);
                result.add(array[i]);
            }
            else{
                hMap.put(array[i], 1);
            }
        }
        return result.toArray();
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(searchEleAtleastTwoArrays(new int[]{1,2,3,9,8,7}, new int[]{4,1,2,10,15}, new int[]{5,1,2,4,10})));
    }   
}
