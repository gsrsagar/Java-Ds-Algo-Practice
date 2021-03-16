package Ds.src.DAA_Mock_Practice;

import java.util.Arrays;
import java.util.HashMap;

public class LetterCombinationsOfPhNmbr {

    public static String [] letterCombOfPhoneNumber(String input){
        HashMap<Integer,Character[]> hMap = new HashMap<>();
        hMap.put(2,new Character[]{'a','b','c'});
        hMap.put(3,new Character[]{'d','e','f'});
        hMap.put(4,new Character[]{'g','h','i'});
        hMap.put(5,new Character[]{'j','k','l'});
        hMap.put(6,new Character[]{'m','n','o'});
        hMap.put(7,new Character[]{'p','q','r','s'});
        hMap.put(8,new Character[]{'t','u','v'});
        hMap.put(9,new Character[]{'w','x','y','z'});
        Character chars[][]=new Character[input.length()+2][];
        int index=0;
        String strs[]=input.split("");
        for(int i=0;i<strs.length;i++){
            if(hMap.containsKey(Integer.valueOf(strs[i]))){
                chars[index]=hMap.get(Integer.valueOf(strs[i]));
                index++;
            }
        }
        String result[]=new String[input.length()*3*4];
        for(int i=0,j=0;i<chars.length && j<chars.length;i++,j++){
            if(chars[0][0]!=null && chars[1][0]!=null){
            result[i]=String.valueOf(chars[i][j]+chars[i+1][j]);
            }
            else if(chars[0][0]!=null){
                System.arraycopy(chars, 0, result, 0, 1);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(letterCombOfPhoneNumber("23")));
    }
}
