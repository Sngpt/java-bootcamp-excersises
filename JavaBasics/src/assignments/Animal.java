package assignments;

public class Animal {

    private String name;
    private double weight;
    private int age;

    private boolean isCarnivore;

    public Animal(String name, double weight, int age, boolean isCarnivore) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.isCarnivore = isCarnivore;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void feed() {
        System.out.println("I eat!!!!");

    }
}
