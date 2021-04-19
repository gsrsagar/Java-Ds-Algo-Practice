package Ds.src.DAA_Mock_Practice;

public class MinSizeSubArray {

    static int minimumSizeSubArray(int arr[], int target){
        int leftSum=target;
        int rightSum=target;
        int leftSize=0;
        int rightSize=0;
        int result=0;
        if(arr.length==0) return 0;
        else if(arr.length==1){
            if(target==arr[0]) return 1;
            else return 0;
        }
        else{
        for(int i=0,j=arr.length-1;i<arr.length/2+1;i++,j--){
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
    }
        if(leftSum==0 || rightSum==0) result=leftSize<rightSize?leftSize:rightSize;

        return result;
    }
    public static void main(String[] args) {
       int result=(minimumSizeSubArray(new int[]{6,1},9));
       if(result==0) System.out.println("Not Possible");
       else System.out.println(result);
    }
}
