package Ds.src.Day2;

import java.util.HashMap;
import java.util.Stack;

public class BalanceParanthesis {
    static String balanceParanthesis(String str){
        HashMap<Character, Character> hMap=new HashMap<>();
        Stack<Character> stack = new Stack<>();
        hMap.put('}','{');
        hMap.put(']','[');
        hMap.put(')','(');
        for(int i=0;i<str.length();i++){
            if(!stack.isEmpty() && stack.peek()==hMap.get(str.charAt(i))){
                stack.pop();
            }
           else if(str.charAt(i)!=' '){
                stack.push(str.charAt(i));
            }
        }
        if(stack.isEmpty()) return ("Balanced");
        else return ("Not Balanced");
    }
    public static void main(String[] args) {
        System.out.println(balanceParanthesis("[()]{}[()()][]{}[]"));
    }
}
