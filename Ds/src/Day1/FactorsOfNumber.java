package Ds.src.Day1;

import java.util.Arrays;
import java.util.HashSet;

public class FactorsOfNumber {

    static Object[] factors(int number){
        HashSet<Integer> results = new HashSet<Integer>();
        for(int i=1;i<=number;i++){
            if(number%i==0){
                results.add(i);
            }
        }
        return results.toArray();
    }
    public static void main(String[] args) {
            System.out.println(Arrays.toString(factors(12)));
    }
}
