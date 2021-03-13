package Ds.src.codingbootcamp;

import java.util.Scanner;

public class NoOfWords {

    public static int noOfWords(String string)
    {
        System.out.println("Enter the string");
 
        Scanner sc = new Scanner(System.in);
 
        String s=sc.nextLine();
 
        int count = 1;
 
        for (int i = 0; i < s.length()-1; i++)
        {
            if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' '))
            {
                count++;
            }
        }
        return count;
    }
 
    public static void main(String[] args) {
        
       System.out.println(noOfWords("My name is sagar reddy"));
    }

}
    
