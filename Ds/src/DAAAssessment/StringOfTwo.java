package Ds.src.DAAAssessment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class StringOfTwo {

    static String stringWithTwo(String input){
        String inputarray[]=input.split(" ");
        String result="";
        HashMap<String,Integer> hmap= new HashMap<>();
        for(int i=0;i<inputarray.length;i++){
            if(!hmap.isEmpty() && hmap.containsKey(inputarray[i])){
                hmap.put(inputarray[i], Integer.valueOf(hmap.get(inputarray[i])+1));
            }
            else hmap.put(inputarray[i],1);
        }
        for(String key:hmap.keySet()){
            if(hmap.get(key)==2){
                result=key;
                break;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String resultArray[]=new String[n]; 
        int index=0;
        while(n>0){
           int length=sc.nextInt();
           String input="";
           for(int i=0;i<length;i++){
               input+=sc.next();
               input+=" ";
           }
           resultArray[index]=stringWithTwo(input);
           index++;
           n--;
        }
        System.out.println(Arrays.toString(resultArray));
        sc.close();
    }
}
