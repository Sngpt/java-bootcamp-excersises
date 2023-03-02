package excercises;

public class Dog extends Animal{
    private String breed;
    Dog(String name,int age, String breed) {
        super(name,age);
        this.breed = breed;
    }

    void makeSound() {
        System.out.println("The Dog barks");
    }
}
