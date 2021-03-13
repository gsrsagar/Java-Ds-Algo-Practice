package Ds.src.Day1;

import java.util.Stack;

public class StringCompression {

    static String stringCompression(String str){
        char chars[]=str.toCharArray();
        String result="";
        Stack<Character> newStack = new Stack<>();
        int count=1;
        for(char c:chars){
            if(!newStack.isEmpty() && newStack.peek()==c){
                count+=1;
            }
            else{
                if(!newStack.isEmpty() && newStack.peek()!=c){
                    result+=count;
                    count=1;
                    newStack.pop();
                    newStack.push(c);
                }
                newStack.push(c);
                result+=c;
            }
        }
        return result;
    } 
    public static void main(String[] args) {
        System.out.println(stringCompression("aaabbccddd"));
    }
}
