package Ds.src.practice;

public class SamplePractice {
    // public static void main(String[] args) {
    //     int x=8,y=20;
    //     int m,a,b,t;
    //     a=x;
    //     b=y;
    //     while(b!=0){
    //         t=b;
    //         b=a%b;
    //         a=t;
    //     }
    //     m=(x*y)/a;
    //     System.out.println(--m*a--);
    // }
    // public static void main(String[] args) {
    //     int i=0;
    //     for(int j=0;j<=3;j++){
    //         do{
    //             System.out.println("Zoho");
    //         }while(i>10);
    //     }
    //     while(i<10){
    //         i=i+1;
    //         continue;
    //        // System.out.println("Zoho");
    //        // break;
    //     }
    //     System.out.println("Zoho");
    // }
    static int fun(int m,int n,int mat[][]){
        int i=0,j=0,sum=0;
        for(;j<3;j++){
            for(j=0;j<3;j++){
                if(i==j){
                    {
                        sum=sum+mat[i][j];
                    }
                }
            }
            if(i<3 && j<4){
                sum=sum+mat[i][j-1];
            }
        }
        return sum;
    }

    static int funtwo(int a,int b){
        int result=0;
        if(a*b >746){
            return result;
        }
        else if(a<b){
            result=a+b;
            result+=funtwo(result, b);
        }
        else if(b<a){
            result=a-b;
            result+=funtwo(result,a);
        }
        return result;
    }
    // public static void main(String[] args) {
    //     int count=0,i=0,j=0,k=0;
    //     for(i=1;i<=60;i++){
    //         for(j=1;j<=5;j++){
    //             count=count+1;
    //             if(j==4){
    //                 continue;
    //             }
    //             if(j==5){
    //                 break;
    //             }
    //             for(k=1;k>j;k++){
    //                 count=count-1;
    //             }
    //         }
    //     }
    //     System.out.println(count);
    // }
    // public static void main(String[] args) {
    //     int i=0,j=0,k=0,n=10,count_m=0,count_n=0;
    //     for(i=0;i<n;i++){
    //         for(j=0;j<n;j++){
    //             count_n++;
    //             if(j%2==0 && count_n%2!=0){
    //                 for(k=0;k<n;k++){
    //                     count_m++;
    //                 }
    //             }
    //         }
    //     }
    //     System.out.println(count_m*count_n/count_n);
    // }
    static void calc(int num){
        int r,sum=0,temp=num;
        while(temp!=0){
            r=temp%10;
            temp=temp/10;
            sum=sum+(r*r*r);
        }
        temp=num;
        if(sum==num){
            int n=0,flag=0;
            do{
                n=temp%10;
                flag+=n;
                temp=temp/10;
            }while(temp!=10);
            System.out.println(sum*flag);
        }
        else{
            int n=0,flag=0;
            do{
                n=temp%10;
                flag+=n;
                temp=temp/10;
            }while(temp!=10);
            System.out.println(sum/flag);
        }
       
    }
    public static void main(String[] args) {
        int a[]={21,10,11,17,29},n=5,result=0;
        for(int i=0;i<n;i++){
            while(a[i]>=n){
                a[i]=a[i]-n;
                result=result+1;
            }
            if(a[i]>0){
                result=result-1;
            }
        }
        System.out.println(result);
    }
}
