package Ds.src.Day2;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPostFix {

    static String inFixToPostFix(String input){
        String result="";
        HashMap<Character, Character> hMap=new HashMap<>();
        Stack<Character> stack = new Stack<>();
        hMap.put('}','{');
        hMap.put(']','[');
        hMap.put(')','(');
        char chars[]=input.toCharArray();
        for(char c:chars){
            if(c=='*'){
                if(!stack.isEmpty() && (stack.peek()=='/' || stack.peek()=='%')){
                    result+=stack.pop();
                }
                stack.push(c);
            }
            else if(c=='+'){
                char ch=' ';
                if(!stack.isEmpty()){
                    ch=stack.peek();
                }
                boolean isHighPrecedence=false;;
                if(ch!='*' && ch!='/' && ch!='%' && ch!='-'){
                    stack.push(c);
                }
                else{    
                    if(ch=='*' || ch=='/' || ch=='%' || ch=='-'){
                    isHighPrecedence=true;
                    }
                    while(isHighPrecedence && !stack.isEmpty()){
                        result+=stack.pop();
                        ch=stack.peek();
                        if(ch!='*'&& ch!='/' && ch!='*' && ch!='-'){
                            isHighPrecedence=false;
                        }
                    }
                    stack.push(c);
                }
            }
            else if(c=='-'){
                char ch=' ';
                if(!stack.isEmpty()){
                    ch=stack.peek();
                }
                boolean isHighPrecedence=false;;
                if(ch!='*' && ch!='/' && ch!='%'  && ch!='+'){
                    stack.push(c);
                }
                else{    
                    if(ch=='*' || ch=='/' || ch=='%' || ch=='+'){
                    isHighPrecedence=true;
                    }
                    while(isHighPrecedence && !stack.isEmpty()){
                        result+=stack.pop();
                        ch=stack.peek();
                        if(ch!='*'&& ch!='/' && ch!='*' && ch!='+'){
                            isHighPrecedence=false;
                        }
                    }
                    stack.push(c);
                }
            }
            else if(c=='/'){
                if(!stack.isEmpty() &&(stack.peek()=='*' || stack.peek()=='%')){
                    result+=stack.pop();
                }
                stack.push(c);
            }
            else if(c=='%'){
                if(!stack.isEmpty() &&(stack.peek()=='/' || stack.peek()=='*')){
                    result+=stack.pop();
                }
                stack.push(c);
            }
            else if(c== ')' || c=='}' || c==']'){
                while(hMap.get(c)!=stack.peek()){
                result+=stack.pop();
                }
                if(!stack.empty() && hMap.get(c)==stack.peek())
                stack.pop();
            }
            else if(c== '(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{
                result+=c;
            }
        }
        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
       // System.out.println(inFixToPostFix("A*(B+c)/D"));
        System.out.println(inFixToPostFix("(A+B/C*(D+E)-F)"));
    }
}
