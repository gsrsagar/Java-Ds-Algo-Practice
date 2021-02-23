package tcs_prepare;
import java.util.*;
public class practice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long s=sc.nextLong();
        System.out.println(s);
        int a[]=new int[10];
        long v;
        for(int i=0;i<10;i++){
            v = s%10;
            s=s/10;
            a[i]= (int)v;
        }
        sc.close();
    }

    
}
