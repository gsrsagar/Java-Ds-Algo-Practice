package Ds.src.DAAAssessment;

import java.util.Arrays;
import java.util.HashMap;

import javax.sound.sampled.ReverbType;

public class RepeatingDecimal {

    static String repeatingDeciaml(int numerator, int denominator){
        String resultvalue=String.valueOf(numerator/denominator);
        HashMap<Integer, Integer> mp = new HashMap<>(); 
        int rem=numerator%denominator;
        if(rem>0) resultvalue+=".";
        while(rem!=0 && !mp.containsKey(rem)){
            mp.put(rem,resultvalue.length());
            rem=rem*10;
            resultvalue+=String.valueOf(rem/denominator);
            rem=rem%denominator;
        }
        if(rem==0){
            return resultvalue;
        }
        else return resultvalue.substring(0,mp.get(rem))+"("+resultvalue.substring(mp.get(rem))+")";
    }
        
    public static void main(String[] args) {
        System.out.println(repeatingDeciaml(50,22));   
        System.out.println((double)50/22);
    }
}



