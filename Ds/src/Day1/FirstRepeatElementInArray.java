package Ds.src.Day1;

import java.util.HashMap;

public class FirstRepeatElementInArray {

    public static int firstRepeatElementInArray(int arr[]){
        HashMap<Integer,Integer> hMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hMap.containsKey(arr[i])){
                return arr[i];
            }
            else{
                hMap.put(arr[i],1);
            }
        }
        return -1;
    }
        public static void main(String[] args) {
            int arr1[]={30,7,30,20,29,8,2,40};
            int arr2[]={1,2,3,10,2,4,5,7,8};
            System.out.println(firstRepeatElementInArray(arr1));
           
        }
}
