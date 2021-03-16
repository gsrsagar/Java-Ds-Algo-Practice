package Ds.src.practice;

import java.util.HashMap;

public class FindPercOfAll_Digits_Nums_SpecialChars {

    static HashMap<String,Float> calculatePercentages(String input){
        int totalChars=input.length();
        HashMap<String,Float> countValues= new HashMap<>();
        countValues.put("Special", (float)0);
        countValues.put("Digits", (float)0);
        countValues.put("UpperCase", (float)0);
        countValues.put("LowerCase", (float)0);
        for(int i=0;i<input.length();i++){
            if(Character.isDigit(input.charAt(i))) 
            countValues.put("Digits",countValues.get("Digits")+1);
            if(Character.isUpperCase(input.charAt(i))) 
            countValues.put("UpperCase",countValues.get("UpperCase")+1);
            if(Character.isLowerCase(input.charAt(i))) 
            countValues.put("LowerCase",countValues.get("LowerCase")+1);
            else {
                countValues.put("Special",countValues.get("Special")+1);
            }

        }
        countValues.put("Special",(float)Math.round(countValues.get("Special")*100/totalChars));
        countValues.put("Digits",(float)Math.round(countValues.get("Digits")*100/totalChars));
        countValues.put("LowerCase",(float)Math.round(countValues.get("LowerCase")*100/totalChars));
        countValues.put("UpperCase", (float)Math.round(countValues.get("UpperCase")*100/totalChars));
        return countValues;
    }
    public static void main(String[] args) {
        System.out.println(String.valueOf(calculatePercentages("Sagar@123")));
    }
}
