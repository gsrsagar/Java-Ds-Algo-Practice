package Ds.src.codingbootcamp;
    
    public class Pyramid {

        public static void pyramid(int n){
            for(int i=1;i<=n;i++){
                for(int j=0;j<n-i;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<2*i-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
    }
    