public class Animal {
    String name;
    int weight;
    int height;

    public  Animal(int weight,int height,String name) {
        this.weight=weight;
        this.height=height;
        this.name=name;
    }

    public void eat(){
        System.out.println("hai iam "+name);
        System.out.println("Iam "+height+" feet");
        System.out.println("with "+weight+" kgs");
    }

}
