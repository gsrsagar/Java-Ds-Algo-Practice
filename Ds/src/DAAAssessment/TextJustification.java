package Ds.src.DAAAssessment;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    
    public static String textAdjust(String [] words, int L){
        List<String> result=new ArrayList<>();
        int index=0;
        while(index<words.length){
            int linelength=words[index].length();
            int last=index+1;
            while(last<words.length){
                if(linelength+words[last].length()+1>L) break;
                linelength+=words[last].length()+1;
                last++;
            }
            StringBuilder str=new StringBuilder();
            int difference=last-index-1;
            if(difference==0 || last==words.length){
                for(int i=index;i<last;i++){
                    str.append(words[i]+" ");
                }
                str.deleteCharAt(str.length()-1);
                for(int i=str.length();i<L;i++){
                    str.append(" ");
                }
            }
            else{
                int spaces=(L-linelength)/difference;
                int remaining=(L-linelength)%difference;
                for(int i=index;i<last;i++){
                    str.append(words[i]);
                    if(i<last-1){
                    for(int j=0;j<=(spaces+((i-index)<remaining?1:0));j++){
                        str.append(" ");
                    }
                }
                }
            }
            result.add(str.toString());
            index=last;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println((textAdjust(new String[]{"he","is","umbrellaboy","into","the","stable","element"}, 12)));
    }
}




