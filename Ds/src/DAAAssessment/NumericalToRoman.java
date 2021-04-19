package Ds.src.DAAAssessment;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NumericalToRoman {

    // public static String intToRoman(int num) {
    //     String M[] = {"", "M", "MM", "MMM"};
    //     String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    //     String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    //     String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    //     return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    
    // }
        private static TreeMap<Integer,String> tmap = new TreeMap<>();
        static{
            tmap.put(1, "I");
            tmap.put(4, "IV");
            tmap.put(5, "V");
            tmap.put(9, "IX");
            tmap.put(10, "X");
            tmap.put(40, "XL");
            tmap.put(50, "L");
            tmap.put(90, "XC");
            tmap.put(100, "C");
            tmap.put(400, "CD");
            tmap.put(500,"D");
            tmap.put(900,"CM");
            tmap.put(1000,"M");
        }

        public static String intToRoman(int input){
            StringBuilder result = new StringBuilder();
            while(input>0){
                int n=tmap.floorKey(input);
                result.append(tmap.get(n));
                input-=n;
            }
            return result.toString();
        }
    public static void main(String[] args) {
        System.out.println(intToRoman(1764));
      // System.out.println(1%3);
      // System.out.println((double)1/3);
       
    }
}
