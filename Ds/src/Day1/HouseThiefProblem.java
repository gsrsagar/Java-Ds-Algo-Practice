package Ds.src.Day1;

public class HouseThiefProblem {


    public static int houseThief(int arr[], int n){
        if(n==0) return n;
        if(n==1) return arr[0];
        if(n==2) return Math.max(arr[0],arr[1]);
        int max[]=new int[n];
        max[0]=arr[0];
        max[1]=Math.max(arr[1],arr[0]);
        for(int i=2;i<n;i++){
                max[i]=Math.max(arr[i]+max[i-2],max[i-1]);
        }
        return max[n-1];
    }

    public static void main(String[] args) {
        int arr[]={20,5,1,13,6,11,40};
        int arr1[]={20,7,30,29,8,2,40};
        int arr2[]={6,7,1,30,8,2,4};
        System.out.println(houseThief(arr1,arr1.length));
    }
}
