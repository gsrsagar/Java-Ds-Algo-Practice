package Ds.src.practice;

public class Reverse_String_By_Reserving_Spaces {

    static String reverseStringByReservingSpaces(String input){
        char result[]=new char[input.length()];
        char inputArray[]=input.toCharArray();
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]==' ') result[i]=' ';
        } 
        for(int i=0,j=result.length-1;i<inputArray.length;i++){
            if(inputArray[i]!=' '){
                if(result[j]==' '){
                    j--;
                }
                result[j]=inputArray[i];
                j--;
            }
        }

        return String.valueOf(result);
    }
    public static void main(String[] args) {
        System.out.println(reverseStringByReservingSpaces("My name is Sagar"));
    }
}
