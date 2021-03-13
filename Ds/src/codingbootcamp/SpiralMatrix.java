package Ds.src.codingbootcamp;

public class SpiralMatrix {
    
    public static int [][] spiralMatrix(int rows, int cols){
        int result[][]=new int[rows][cols];
        int startRow=0;
        int startCol=0;
        int endRow=rows-1;
        int endCol=cols-1;
        int counter=1;
        while(startRow<=endRow && startCol<=endCol){
            //Top Row
            for(int i=startCol;i<=endCol;i++){
                result[startRow][i]=counter;
                counter++;
            }
            startRow++;

            //Right Column
            for(int i=startRow;i<=endRow;i++){
                result[i][endCol]=counter;
                counter++;
            }
            endCol--;
            //Bottom Row
            for(int i=endCol;i>=startCol;i--){
                result[endRow][i]=counter;
                counter++;
            }
            endRow--;
            for(int i=endRow;i>=startRow;i--){
                result[i][startCol]=counter;
                counter++;
            }
            startCol++;
        }
        return result;
    }
}
