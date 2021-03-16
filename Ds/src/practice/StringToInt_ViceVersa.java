package Ds.src.practice;

import java.io.DataInput;

import org.w3c.dom.TypeInfo;

public class StringToInt_ViceVersa {

    static Integer stringToInt(String input){
        //Integer.parseInt(input);
        //Integer.valueOf(input);
        return Integer.valueOf(input);
    }
    static String intToString(int input){
        // input.toString();
        //String.valueOf(input);
        return String.valueOf(input);
    }
    public static void main(String[] args) {
        System.out.println(stringToInt("2015").getClass().getSimpleName());
        System.out.println((intToString(2015).getBytes().hashCode()));
        System.out.println((intToString(2015).getClass().getName()));
        System.out.println((intToString(2015).getClass().getSimpleName()));
        System.out.println((intToString(2015).getClass().getTypeName()));
        System.out.println((intToString(2015).getClass().getCanonicalName()));

    }
}
