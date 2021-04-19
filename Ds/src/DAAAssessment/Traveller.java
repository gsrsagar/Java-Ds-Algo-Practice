package Ds.src.DAAAssessment;

public class Traveller {

    static int travellerCities(int arr[]){
        int sum=0;
        int required=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum<0) required+=Math.abs(sum);
            else if(sum==0) required++;
        }
        if(sum<0) required=Math.abs(sum);
        return required;
        
    }
    public static void main(String[] args) {
        System.out.println(travellerCities(new int[]{10,-5,7,-8,5,-14}));
        System.out.println(travellerCities(new int[]{10,-5,7,-8,5,-9}));
        System.out.println(travellerCities(new int[]{10,-5,7,-8,5,-11}));
        System.out.println(travellerCities(new int[]{10,-5,7,-8,5,-12}));
    }
}
