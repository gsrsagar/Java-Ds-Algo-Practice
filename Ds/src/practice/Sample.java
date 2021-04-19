
package Ds.src.practice;
import java.io.*;
import java.util.*;


public class Sample {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            int M = Integer.parseInt(br.readLine().trim());
            int K = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
            	A[i_A] = Integer.parseInt(arr_A[i_A]);
            }

            int out_ = delete_subarray(N, M, K, A);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    static int delete_subarray(int N, int M, int K, int[] A){
       // Write your code here
       int sum=0;
       int lengthRem;
       int result=0;
       for(int i=0;i<A.length;i++){
        sum+=A[i];
        if(sum==K) {
            if((i+1)%2==0) {
               lengthRem=A.length-i-1;
               if(lengthRem%2==0) result=(lengthRem/2); 
               break; 
            }
            else if(i+1%2!=0){
                sum=0;
            }
        }
    }
 return result;
    }
}