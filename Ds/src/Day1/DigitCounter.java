package Ds.src.Day1;

public class DigitCounter {

    public static int digitCounter(int value){
        int counter=0;
        value=Math.abs(value);
        while(value>=1){
            value=value/10;
            counter++;
        }
        return counter;
    }
    
}
