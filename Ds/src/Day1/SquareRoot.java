package Ds.src.Day1;

public class SquareRoot {
    static String squareRoot(int value){
        int count=1;
        for(int i=1;i<Math.sqrt(value);i++){
            if(value%i==0) count++;
        }
        if(count==2) return ("It's a Prime Number");
        else return ("It's Not a Prime Number");
    }
    public static void main(String[] args) {
            System.out.println(squareRoot(11));
    }
}
