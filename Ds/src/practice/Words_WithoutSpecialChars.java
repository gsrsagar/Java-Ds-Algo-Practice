package Ds.src.practice;

import java.util.Arrays;

public class Words_WithoutSpecialChars {

    static int countWordsWithoutSpecialChars(String input){
        String output[]=input.split(" ");
        int count=0;
        System.out.println(Arrays.toString(output));
        for(int i=0;i<output.length;i++){
            if(output[i].matches("^[a-zA-Z-]+$")) count++;
            else {
                int  index=0;
                int currentindex=0;
                if(output[i].contains(".")) {
                    currentindex=output[i].indexOf(".");
                    if(currentindex<index) index=currentindex;
                }
                if(output[i].contains("!")){
                    currentindex=output[i].indexOf("!");
                    if(currentindex<index) index=currentindex;
                }
                if(output[i].contains("?")){
                    currentindex=output[i].indexOf("?");
                    if(currentindex<index) index=currentindex;
                }
                if(output[i].contains(",")){
                    currentindex=output[i].indexOf(",");
                    if(currentindex<index) index=currentindex;
                }
                output[i]=output[i].substring(0,index);
                System.out.println(output[i]);
                count++;
            }
        }
        System.out.println();
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countWordsWithoutSpecialChars("How many eggs are in a half-dozen.13?"));
    }
}
