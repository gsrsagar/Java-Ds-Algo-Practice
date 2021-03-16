package Ds.src.Day2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    
    
    public String fractionAddition(String expression) {
        Fraction fraction = new Fraction();
        List<String> list = new ArrayList<>();    
        int prev = 0;
        for (int i = 0; i <= expression.length(); i++) {
            if (i == expression.length() || i > 0 && ( expression.charAt(i) == '+' || expression.charAt(i) == '-')) {
                list.add(expression.substring(prev, i));
                prev = i;
            }
        }
        
        
        for (String s : list) {
            fraction = fraction.add(Fraction.fromString(s));
        }
        return fraction.toString();
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        System.out.println(s.fractionAddition("-1/2+1/2"));
    }
}