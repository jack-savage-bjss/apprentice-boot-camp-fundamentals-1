package cards;

public class AnimalCard implements SnappableCard {

    private final Animal animal;

    AnimalCard(Animal animal) {
        this.animal = animal;
    }

    public boolean snap( SnappableCard otherCard ) {
        if(!(otherCard instanceof AnimalCard)) {
            return false;
        }
        return this.animal.equals(((AnimalCard) otherCard).animal);
    }

    @Override
    public String toString() {
        return animal.toString();
    }

}
