package Ds.src.DAA_Mock_Practice;

public class BestTimeToBuySell {
//The best part about this program is , It hardly took 5 Minutes for me to complete --Successfully
    public int bestTimeToBuySell(int array[]){
        int left=array[0];
        int right=array[array.length-1];
        for(int i=0,j=array.length-1;i<array.length/2;i++,j--){
            if(array[i]<left) left=array[i];
            if(array[j]>right) right=array[j];
        }
        if(left<right) return right-left;
        else return 0;
    }
    public static void main(String[] args) {
        BestTimeToBuySell b= new BestTimeToBuySell();
        System.out.println(b.bestTimeToBuySell(new int[]{7,6,4,3,1}));
        System.out.println(b.bestTimeToBuySell(new int[]{7,1,5,3,6,4}));
    }
}
