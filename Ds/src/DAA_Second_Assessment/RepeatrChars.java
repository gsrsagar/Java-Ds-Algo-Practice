package Ds.src.DAA_Second_Assessment;

import java.util.Scanner;
import java.util.Stack;

public class RepeatrChars {

        // public int miniMizeLength(String input,int k){
        //     String temp=input.substring(0,input.length()/2);
        //     String left=input.substring(input.length()/2,input.length());
        //     String right=temp;
        //      System.out.println(input);
        //     System.out.println(left);
        //     System.out.println(right);
        //     StringBuilder sb= new StringBuilder(left);
        //     sb.append(right);
        //     Stack<Integer> counts = new Stack<>();
        //     for(int i=0;i<sb.length();++i){
        //         if(i==0 || sb.charAt(i)!=sb.charAt(i-1)){
        //             counts.push(1);
        //         }
        //         else{
        //             int incremented=counts.pop()+1;
        //             if(incremented==k){
        //                 sb.delete(i-k,i+1);
        //                 i=i-k;
        //             }
        //             else counts.push(incremented);
        //         }
        //     }
        //     return sb.length();
        // }
        public static void main(String args[] ) throws Exception {
            
             Scanner s = new Scanner(System.in);
             String name = s.nextLine();
             s.close();
             int k=1;
             String input=name;
            String temp=input.substring(0,input.length()/2);
            String left=input.substring(input.length()/2,input.length());
            String right=temp;
            StringBuilder sb= new StringBuilder(left);
            sb.append(right);
            Stack<Integer> counts = new Stack<>();
            for(int i=0;i<sb.length();++i){
                if(i==0 || sb.charAt(i)!=sb.charAt(i-1)){
                    counts.push(1);
                }
                else{
                    int incremented=counts.pop()+1;
                    if(incremented>k){
                        sb.delete(i-k,i+1);
                        i=i-k;
                    }
                    else counts.push(incremented);
                }
            }
            // return sb.length();
              System.out.println(sb.length());
        }
    }

