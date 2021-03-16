package Ds.src.practice;

public class Count_No_of_Words_In_String {

    static int countNoOfWords(String str){
        int count=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countNoOfWords("Java is a language in the world"));
    }
}
