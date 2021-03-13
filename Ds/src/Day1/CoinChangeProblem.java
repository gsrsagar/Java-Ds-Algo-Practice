package Ds.src.Day1;

import java.util.HashMap;

public class CoinChangeProblem {

    static int coinChangeProblem(int value){
        int result=1;
        int coins=0;
        while(value>=1){
            result=value%10;
            if(result>0){
                if(result>=5){
                    coins++;
                    result=result%5;
                }
                if(result==2 || result==1){
                    coins++;
                }
                if(result==4){
                    coins++;
                }
                if(result==3){
                    coins+=2;
                }
            }
            value=value/10;
        }
        return coins;
    }
    
    public static void main(String[] args) {
            System.out.println(coinChangeProblem(121));
    }
}
