package Ds.src.practice;

public class Check_Rotation_Of_String {

    static boolean checkRotationOfString(String s1, String s2){
        String s3=s1+s1;
        if(s1.length()!=s2.length()) return false;
        if(s3.contains(s2)) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(checkRotationOfString("JavaSpringHibernate", "SpringHibernateJava"));
    }
}
