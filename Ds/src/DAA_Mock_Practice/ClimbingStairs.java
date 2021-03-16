package Ds.src.DAA_Mock_Practice;

public class ClimbingStairs {

    static int fib(int n){
        if(n<=1) return n;
        else {
            return fib(n-1)+fib(n-2);
        }
    }

    static int climbingStairs(int n){
        return fib(n+1);
    }
    public static void main(String[] args) {
        System.out.println(climbingStairs(4));
    }   
}
