import java.util.*;

class Sample{
    public static void main(String[] args) {
        System.out.println("hai");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        float arr[]= new float[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextFloat();
        }
        sc.close();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    float temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("oputut");
        if(arr[0]==arr[1] && arr[0]==arr[2]){
            for(int i=3;i<i+3;i++){
                System.out.println(arr[i]);
            }
        }
        else{
            System.out.println("invalid Input");
        }

    }
}