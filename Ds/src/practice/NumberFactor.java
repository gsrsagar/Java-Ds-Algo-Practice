package Ds.src.practice;

public class NumberFactor {

    static int numberFactor(int n){
        if(n==0 || n==1 || n==2) return 1;
        else if(n==3) return 2;
        else if(n==4) return 5;
        else{
            int ways1=numberFactor(n-1);
            int ways2=numberFactor(n-3);
            int ways3=numberFactor(n-4);
            return ways1+ways2+ways3;
        }
    }

    public static void main(String[] args) {
        System.out.println(numberFactor(5));
    }
    
}
