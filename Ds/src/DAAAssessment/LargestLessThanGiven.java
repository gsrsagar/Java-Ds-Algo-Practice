package Ds.src.DAAAssessment;

public class LargestLessThanGiven {


    static int largestLessThanGiven(int input,int l){
        int place=1;
        while(input>=1){
            if(input%10==l) break;
            place*=10;
            input=input/10;
        }
        int result=input*(place)-1;
        while(result%10==l){
            result=result-1;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(largestLessThanGiven(191, 9));
    }
}
