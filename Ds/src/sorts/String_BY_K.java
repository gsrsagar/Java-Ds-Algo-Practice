package Ds.src.sorts;

public class String_BY_K {
    
    static String increaseByK(String input, int k){
        char ch[]=input.toCharArray();
        for(int i=0;i<ch.length;i++){
           ch[i]=(char)(ch[i]+2);
        }
        return String.valueOf(ch);
    }
    static String decreaseByK(String input,int k){
        char ch[]=input.toCharArray();
        for(int i=0;i<ch.length;i++){
           ch[i]=(char)(ch[i]-2);
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
       // System.out.println(decreaseByK(line, k));
    }
}
