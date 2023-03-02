package assignments;

public class Bears extends Animal{

    public Bears(String name,double weight,int age) {
        super(name,weight,age,false);
    }

    public void feed() {
        System.out.println("I am herbivore.I eat plants.");
    }

}
