package Ds.src.DAA_Second_Assessment;

import java.util.HashMap;
import java.util.Stack;


public class LongestSubStringOfSameChars {

    static String subStringOfSameChars(String input){
        HashMap<Character,Integer> hmap = new HashMap<>();
        Stack<Character> store = new Stack<>();
        Stack<Integer> value=  new Stack<>();
        String result=" ";
        int count=0;
        int maxvalue=0;
        for(int i=0;i<input.length();i++){
            count=0;
            if(!store.isEmpty() && store.peek()==input.charAt(i)){
                value.push(value.pop()+1);
                if(hmap.containsKey(input.charAt(i))){
                    int val = hmap.get(input.charAt(i));
                    Character c= store.peek();
                    if(val< value.peek() && input.charAt(i)==c) hmap.put(store.peek(),value.peek());
                    if(maxvalue<value.peek()) maxvalue=value.peek();
                }
            }
            else{
                count++;
                hmap.put(input.charAt(i),count);
                store.push(input.charAt(i));
                value.push(count);
            }
        }
        for(HashMap.Entry<Character, Integer> entry:hmap.entrySet()){
            if(hmap.get(entry.getKey())==maxvalue){
                result+="{"+entry.getKey()+":"+hmap.get(entry.getKey()).toString()+"}"; 
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(subStringOfSameChars("AABBBCCDDEEE"));   
    }
}
