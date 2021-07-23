package stack.and.queue;

public class Animal {
    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalName;
    }

    @Override
    public String toString() {
        return animalName;
    }
}
