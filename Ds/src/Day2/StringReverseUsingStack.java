package Ds.src.Day2;

import java.util.Stack;

public class StringReverseUsingStack {

    static String stringReverse(String input){
        String result="";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<input.toCharArray().length;i++){
            stack.push(input.charAt(i));
        }
        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(stringReverse("Hello World"));
    }
}
