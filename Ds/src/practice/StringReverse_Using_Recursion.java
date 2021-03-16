package Ds.src.practice;

public class StringReverse_Using_Recursion {

    static String recursiveMethod(String str){
     if ((null == str) || (str.length() <= 1)){
        return str;
     }
     return recursiveMethod(str.substring(1)) + str.charAt(0);
}

    public static void main(String[] args) {
        System.out.println(recursiveMethod("my name is sagar"));
    }   
}
