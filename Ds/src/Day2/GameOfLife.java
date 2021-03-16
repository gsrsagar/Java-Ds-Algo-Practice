package Ds.src.Day2;

import java.util.Arrays;
import java.util.HashMap;

public class GameOfLife {

    public int [][] gameOfLife(int arr[][]){
        HashMap<String ,Integer> hMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length-1;j++){
                if(j==0 && i==0){ // 1st row 1st column
                    if(i<arr.length-1 && arr[i+1][j+1]==1) count++; // right below diagonal
                    if(arr[i][j+1]==1) count++; //right
                    if(i<arr.length-1 && arr[i+1][j]==1) count++; // below
                }
                else if(j==0 && i==arr.length-1){ //1st column last row bottom left
                    if(j<arr.length-1 && arr[i][j+1]==1) count++; //right
                    if(i<arr.length-1 && arr[i-1][j]==1) count++; //top
                    if(i<arr.length-1 && arr[i-1][j+1]==1) count++; // right top diagonal
                }
                else if(j==arr.length-1 && i==arr.length-1){ // middle row and middle column
                    if(arr[i][j-1]==1) count++; //left
                   if( arr[i-1][j]==1) count++; // top
                //    if(i<arr.length-1 && arr[i+1][j-1]==1) count++; // left below diagoanl
                //    if(i<arr.length-1 && arr[i+1][j+1]==1) count++; // right below diagonal
                  // if(i<=arr.length-1 && arr[i-1][j+1]==1) count++; // right above diagonal
                   if(arr[i-1][j-1]==1) count++; // left above diagonal
                }
                else if(j==arr.length-3 && i==arr.length-1){ // middle row and middle column
                    if(arr[i][j-1]==1) count++; //left
                   if(j<arr.length-1 && arr[i][j+1]==1) count++; //right
                   if(i<=arr.length-1 &&  arr[i-1][j]==1) count++; // top
                //    if(i<arr.length-1 && arr[i+1][j-1]==1) count++; // left below diagoanl
                //    if(i<arr.length-1 && arr[i+1][j+1]==1) count++; // right below diagonal
                   if(i<=arr.length-1 && arr[i-1][j+1]==1) count++; // right above diagonal
                   if(i<=arr.length-1 && arr[i-1][j-1]==1) count++; // left above diagonal
                }
               else if(i==0 && j==arr.length-2){
                    if(i<arr.length-1 && arr[i+1][j]==1) count++; // below
                    if(arr[i][j-1]==1) count++; //left
                    if(i<arr.length-1 && arr[i+1][j-1]==1) count++; // left below diagoanl
                }
               else if(i>0 && j==arr.length-2){
                    if(j<arr.length-1 && arr[i-1][j]==1) count++; //top
                    if(i<arr.length-1 && arr[i+1][j]==1) count++; // below
                    if(i<arr.length-1 && arr[i][j-1]==1) count++; // left
                    if(i<arr.length-1 && arr[i+1][j-1]==1) count++; //left below diagoanl
                    if(i<arr.length-1 && arr[i-1][j-1]==1) count++; // right top diagonal
                }
               else if(i==arr.length-1 && j==arr.length-1){
                    if(i<arr.length-1 && arr[i][j-1]==1) count++; // left
                    if(j<arr.length-1 && arr[i-1][j]==1) count++; //top
                    if(i<arr.length-1 && arr[i-1][j-1]==1) count++; // left above diagonal
                }
               else if(j>0 && j<=arr.length-3 &&  i==0){ // top 1st row and middle column
                   if(arr[i][j-1]==1) count++; //left
                   if(j<arr.length-1 && arr[i][j+1]==1) count++; //right
                   if(i<arr.length-1 && arr[i+1][j]==1) count++; // below
                   if(i<arr.length-1 && arr[i+1][j-1]==1) count++; // left below diagoanl
                   if(i<arr.length-1 && arr[i+1][j+1]==1) count++; // right below diagonal
                }
               else if(j==arr.length-2 && i==arr.length-1){ // top 1st row and middle column
                    // if(i<arr.length-1 && arr[i-1][j+1]==1) count++; // right above diagonal
                   // if(i<arr.length-1 && arr[i-1][j-1]==1) count++; // left above diagonal
                    if(j<arr.length-1 && arr[i-1][j]==1) count++; //top
                    if(i<arr.length-1 && arr[i][j-1]==1) count++; // left
                    if(i<=arr.length-1 && arr[i-1][j-1]==1) count++; // left above diagonal
                   // if(i<=arr.length-1 && arr[i-1][j+1]==1) count++; // right above diagonal
                 }
                 else if(j==0 && i>0){ // middle row and first column left
                    if(j<arr.length-1 && arr[i][j+1]==1) count++; //right
                    if(i<arr.length-1 && arr[i+1][j]==1) count++; // below
                    if(i<arr.length-1 && arr[i+1][j+1]==1) count++; // right below diagonal
                    if(i<arr.length-1 && arr[i-1][j]==1) count++; //top
                    if(i<arr.length-1 && arr[i-1][j+1]==1) count++; // right top diagonal
                }
               else if(j<=arr.length-3 && j>0 && i>0){ // middle row and middle column
                    if(arr[i][j-1]==1) count++; //left
                   if(j<arr.length-1 && arr[i][j+1]==1) count++; //right
                   if(i<arr.length-1 && arr[i+1][j]==1) count++; // below
                   if(i<arr.length-1 && arr[i-1][j]==1) count++; // top
                   if(i<arr.length-1 && arr[i+1][j-1]==1) count++; // left below diagoanl
                   if(i<arr.length-1 && arr[i+1][j+1]==1) count++; // right below diagonal
                   if(i<=arr.length-1 && arr[i-1][j+1]==1) count++; // right above diagonal
                   if(i<=arr.length-1 && arr[i-1][j-1]==1) count++; // left above diagonal
                }  
                else if(j<=arr.length-3 && i==arr.length-1){
                    if(arr[i][j-1]==1) count++; //left
                    if(j<arr.length-1 && arr[i][j+1]==1) count++; //right
                    if(i<arr.length-1 && arr[i-1][j]==1) count++; // top
                    if(i<=arr.length-1 && arr[i-1][j-1]==1) count++; // left above diagonal
                    if(i<=arr.length-1 && arr[i-1][j+1]==1) count++; // right above diagonal
                }
                else if(j==arr.length-2 && j>0 && i>0){ // bottom row and middle column
                    if(arr[i][j-1]==1) count++; //left
                  // if(i<arr.length-1 && arr[i][j+1]==1) count++; //right
                   if(i<=arr.length-1 && arr[i-1][j]==1) count++; // top
                   if(i<=arr.length-1 && arr[i][j-1]==1) count++;
                   if(i<arr.length-1 && arr[i+1][j]==1) count++;
                  // if(i<=arr.length-1 && arr[i-1][j+1]==1) count++; // right above diagonal
                   if(i<=arr.length-1 && arr[i-1][j-1]==1) count++; // left above diagonal
                   if(i<arr.length-1 && arr[i+1][j-1]==1) count++;
                }      
            
                if(count==3){
                    hMap.put(i+" "+j,1);
                }
                if(count==4){
                    hMap.put(i+" "+j,0);
                }
                if(count==1){
                    hMap.put(i+" "+j,0);
                }
                count=0;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(hMap.containsKey(i+" "+j)){
                    arr[i][j]=hMap.get(i+" "+j);
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        GameOfLife h = new GameOfLife();
        //int arr[][]=h.gameOfLife(new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}});
        int arr[][]=h.gameOfLife(new int[][]{{1,1},{1,0}});
        System.out.println("{0,1,0} \n{0,0,1} \n{1,1,1} \n {0,0,0}");
        for(int [] array:arr){
            System.out.println(Arrays.toString(array));
        }
    }
}
