import java.util.Scanner;


/**
 * QuickStart
 */
public class QuickStart {

    public QuickStart(){

    }
    public static void main(String[] args) {
        // Counter c=new Counter("MyCounter");
        // c.increment();
        // c.increment();
        // c.increment();
        // System.out.println("c.toString() "+c.toString());
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        CustomStack stack=new CustomStack();
        while(length!=0){
            length--;
            stack.push(sc.next().charAt(0) );
        }
        sc.close();

        while(!(stack.isEmpty())){
            System.out.println(stack.pop());
        }


    }
}