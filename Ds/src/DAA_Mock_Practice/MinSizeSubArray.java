package Ds.src.DAA_Mock_Practice;

public class MinSizeSubArray {

    static int minimumSizeSubArray(int arr[], int target){
        int leftSum=target;
        int rightSum=target;
        int leftSize=0;
        int rightSize=0;
        int result=0;
        for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
            if(leftSum==0 || rightSum==0){
                break;
            }
            else{
                leftSum=leftSum-arr[i];
                leftSize++;
                rightSum=rightSum-arr[j];
                rightSize++;
            }
        }
        if(leftSum==0 || rightSum==0) result=leftSize<rightSize?leftSize:rightSize;

        return result;
    }
    public static void main(String[] args) {
        System.out.println(minimumSizeSubArray(new int[]{2,3,1,2,4,3},7));
    }
}
