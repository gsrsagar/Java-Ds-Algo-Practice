package Ds.src.searching;

public class linear {
    int result;
    public long linearSearch(long  arr [],long input){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==input){
                return i;
            }
        }
        return -1;
    }
}
