package Ds.src.DAA_Mock_Practice;

public class OrderlyQueue {
    static String orderlyQueue(String input,int index){
        input=input.substring(1,input.length())+input.charAt(0);
        input=input.substring(0, index-1)+input.substring(index,input.length())+input.charAt(index-1);
        return input;
    }
    public static void main(String[] args) {
        System.out.println(orderlyQueue("cba", 1));
        System.out.println(orderlyQueue("baaca", 3));
    }
}
