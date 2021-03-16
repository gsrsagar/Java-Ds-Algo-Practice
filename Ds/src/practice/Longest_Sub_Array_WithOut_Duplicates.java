package Ds.src.practice;

import java.util.LinkedHashMap;

public class Longest_Sub_Array_WithOut_Duplicates {

    static String longest_sub_array_without_duplicates(String input){
        LinkedHashMap<Character,Integer> characterCount  = new LinkedHashMap<>();
        String longestSubArray="";
        int lengthOfLongestSubArray=0;
        for(int i=0;i<input.length();i++){
            if(!characterCount.containsKey(input.charAt(i))){
                characterCount.put(input.charAt(i),i);
            }
            else{
                if(characterCount.containsKey(input.charAt(i))){
                    i=characterCount.get(input.charAt(i));
                    characterCount.clear();
                }
            }
        }
        if(characterCount.size()>lengthOfLongestSubArray){
            lengthOfLongestSubArray=characterCount.size();
            longestSubArray=characterCount.keySet().toString();
        }
        return longestSubArray;
    }
    public static void main(String[] args) {
        System.out.println(longest_sub_array_without_duplicates("javaconceptoftheday"));
        System.out.println(longest_sub_array_without_duplicates("thelongestsubstring"));
    }    
}
