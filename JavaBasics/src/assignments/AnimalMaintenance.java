package assignments;

public class AnimalMaintenance {

    public static void main(String... args) {

        Herbivores herbivores = new Herbivores();
        Carnivores carnivores = new Carnivores();

        herbivores.addAnimal(new Lions("Roar",100,20));
        carnivores.addAnimal(new Lions("Roar",100,20));
        herbivores.addAnimal(new Bears("MashaBear",150,12));
        carnivores.addAnimal(new Bears("MashaBear",150,12));

        carnivores.displayAnimals();
        herbivores.displayAnimals();

    }
}
