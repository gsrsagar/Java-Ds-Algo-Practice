package Ds.src.codingbootcamp;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter input string to be cleaned from white spaces...!");
         
        String inputString = sc.nextLine();
         
        String stringWithoutSpaces = inputString.replaceAll("\s+", "");
        // for (int i = 0; i < charArray.length; i++) 
        // {
        //     if ( (charArray[i] != ' ') &amp;&amp; (charArray[i] != '\t') )
        //     {
        //         stringWithoutSpaces = stringWithoutSpaces + charArray[i];
        //     }
        // }
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
         
        sc.close();
    }
}
