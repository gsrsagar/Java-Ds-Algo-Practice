package Ds.src.codingbootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.IntStream;


public class RemoveDuplicateWordsInString {

    static String removeDuplicateWords(String str){
        String result="";
        HashMap<String , Integer> wordCount= new HashMap<>();
        String words[]=str.split(" ");
        for(String word:words){
            if(wordCount.containsKey(word)){
                wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
            }
            else{
                wordCount.put(word.toLowerCase(), 1);
            }
        }
        System.out.println(Arrays.toString(words));
        Set<String> wordsCount=wordCount.keySet();
        System.out.println("final string:"+(wordsCount.toString()));

        Set<String> wordsInString = wordCount.keySet();
 
        //Iterating through all words in wordCount
 
        for (String word : wordsInString)
        {
            //if word count is greater than 1
 
            if(wordCount.get(word) > 1)
            {
                //Printing that word and it's count
 
                System.out.println(word+" : "+wordCount.get(word));
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(removeDuplicateWords("my name is my name is sagar sagar"));
    }
}
