package Ds.src.practice;

import java.util.Arrays;

public class SwapTwoStringsWithOut_Third_Variable {

    static String swapWithOutThirdVariable(String s1, String s2){
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        return s1+","+s2;
    }
    public static void main(String[] args) {
        String results[]=swapWithOutThirdVariable("This is Sagar", "This is Subash").split(",");
        System.out.println(Arrays.toString(results));
    }
}
