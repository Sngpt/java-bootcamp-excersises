package assignments;

public class Herbivores {

    Animal[] animals = new Animal[100];;
    static int count = 0;
    public void addAnimal(Animal animal) {

        if(!animal.isCarnivore()) {
            animals[count++] = animal;
        } else {
            System.out.println("This animal "+animal.getName()+" cannot be added.As its a carnivore");
        }
    }

    public void displayAnimals() {
        for(Animal a : animals) {
            if(a != null) {
                System.out.println("Animal name:" + a.getName() + "  ");
                a.feed();
            } else {
                break;
            }
        }
    }
}
