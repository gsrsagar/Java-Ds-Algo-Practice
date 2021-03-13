package Ds.src.Day1;

public class ProductOfOtherElementsArray {
    
    public static int [] productArray(int arr []){
        int resultArray[]=new int[arr.length];
        int result=1;
        for(int i=0;i<arr.length;i++){
            result*=arr[i];
        }
        for(int j=0;j<arr.length;j++){
            resultArray[j]=result/arr[j];
        }
      return resultArray;
    }
}
