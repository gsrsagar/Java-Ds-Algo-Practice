package Ds.src.DAAAssessment;



public class PangramString
{
	public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy";
        char chars[]=str.toLowerCase().toCharArray();
        int indexs[]=new int[26];
        for(int i=0;i<chars.length;i++){
            if(chars[i]!=' ') indexs[chars[i]-'a']++;
        }
        String result="";
        for(int j=0;j<indexs.length;j++){
            if(indexs[j]==0) result+=(char)(j+'a');
        }
        System.out.println(result);
    }

}
