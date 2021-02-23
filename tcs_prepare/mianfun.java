package tcs_prepare;

import java.util.Scanner;

public class mianfun {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String name=sc.nextLine();
      String arr[]=name.split(" ");
      for(int i=0;i<arr.length;i++){
          char a[]=arr[i].toCharArray();
          String str="";
          int b[]={};
          for(int j=a.length-1;j>=0;j--){
              str+=a[j];int l=0;

              b[l++]=(int)a[j];
          }
          arr[i]=str;
        }
    for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
    }
    sc.close();
} 
}    

