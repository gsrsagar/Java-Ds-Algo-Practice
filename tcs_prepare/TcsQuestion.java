package tcs_prepare;
import java.util.Scanner;

public class TcsQuestion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int count=0;
        int a=0;
        while(true){
            if(a%2==0 || a%3==0 || a%5==0){
                count++;
            }
            if(size==count){
                break;
            }
            a++;
        }
        System.out.println(a);
        sc.close();
    }
}
