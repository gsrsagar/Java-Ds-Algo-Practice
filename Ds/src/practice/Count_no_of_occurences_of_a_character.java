package Ds.src.practice;

public class Count_no_of_occurences_of_a_character {

    static int countNoOfOccurencesOfaChar(String s, char c){
 
        int count = s.length()-s.replace("a","").length();
        System.out.println("Number of occurances of 'a' in "+s+" = "+count);
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countNoOfOccurencesOfaChar("java is a java and java", 'a'));
    }
}
