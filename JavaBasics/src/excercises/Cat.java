package excercises;

public class Cat extends Animal {

   private int noOfLives;
    Cat(String name,int age, int noOfLives) {
        super(name,age);
        this.noOfLives = noOfLives;
    }

     void makeSound() {
        System.out.println("The cat meows");
    }

}
