package Ds.src.practice;

public class Remove_whitespaces_from_string {

    static String removeWhiteSpaces(String input){
        String result="";
        char chars[]=input.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]!=' ' && chars[i]!='\t'){
                result+=chars[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("My name is sagar reddy"));
    }
}
