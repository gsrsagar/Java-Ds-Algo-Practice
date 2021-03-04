public class Zoo {

    public int foo(int n){
        if(n<1) return n;
        
        return 0;
    }
    public static void main(String[] args) {
        Animal animal = new Animal(450, 6, "zirafee");
        Animal animal2;
        animal2=new Animal(234,6,"zebra");
        animal.eat();
        animal2.eat();
        
    }
    
}
