package Ds.src.Day1;

public class ReachingPoints {

    static boolean reachingPoints(int sx, int sy, int tx, int ty){
        if(tx==sx+sy){
            if(ty==sy) return true;
            else return false;
        }
        else if(ty==sx+sy){
            if(tx==sx) return true;
            else return  false;
        }
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(reachingPoints(1,1,1,2));
    }
}
