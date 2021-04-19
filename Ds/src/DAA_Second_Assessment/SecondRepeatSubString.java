package Ds.src.DAA_Second_Assessment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SecondRepeatSubString {


    static String secondRepeatSubString(String input){
        input=input.trim();
        String inputarray[]=input.split(" ");
        String result="";
        HashMap<String,Integer> hmap= new HashMap<>();
        int maxValue=0;
        for(int i=0;i<inputarray.length;i++){
            if(!hmap.isEmpty() && hmap.containsKey(inputarray[i])){
                hmap.put(inputarray[i], Integer.valueOf(hmap.get(inputarray[i])+1));
                if(maxValue<hmap.get(inputarray[i])) maxValue=hmap.get(inputarray[i]);
            }
            else hmap.put(inputarray[i],1);
        }
        for(String key:hmap.keySet()){
            if(hmap.get(key)<maxValue){
                result=key;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int len=sc.nextInt();
        String result[]=new String[len];
        int index=0;
        while(len>0){
            int size=sc.nextInt();
            String input=" ";
            for(int i=0;i<size;i++){
                input+=sc.next()+" ";
            }
            result[index]=secondRepeatSubString(input);
            index++;
            len--;
        }
        sc.close();
        System.out.println(Arrays.toString(result));
    }
}
