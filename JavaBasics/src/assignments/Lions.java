package assignments;

public class Lions extends Animal{


    public Lions(String name,double weight,int age) {
        super(name,weight,age,true);

    }

    public void feed() {
        System.out.println("I am a carnivore. I eat mammals!!!");
    }

}
