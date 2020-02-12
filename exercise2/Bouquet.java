package exercise2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Bouquet {
    Set<String> flowers;

    public Bouquet(Set<String> flowers) {
        this.flowers = flowers;
    }

    public Collection<String> getAll() {
        return new HashSet<>(this.flowers);
    }

    public void addFlower(String flower) {
        this.flowers.add(flower);
    }

    public void removeFlower(String flower) {
        if (findFlower(flower)) {
            this.flowers.remove(flower);
        } else {
            System.out.println("Flower not found in bouquet. Cannot be removed");
        }
    }

    private boolean findFlower(String flower) {
        return this.flowers.contains(flower);
    }

    @Override
    public String toString() {
        return "Bouquet composition: " + this.flowers;
    }
}
