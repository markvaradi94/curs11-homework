package exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Basket {
    private final String fruit;
    private List<String> fruitList = new ArrayList<>();

    public Basket() {
        this.fruit = "";
    }

    public void addFruit(String fruit) {
        this.fruitList.add(fruit);
    }

    public boolean findFruit(String fruit) {
        return this.fruitList.contains(fruit);
    }

    public boolean removeFruit(String fruit) {
        if (findFruit(fruit)) {
            this.fruitList.remove(fruit);
            return true;
        }
        return false;
    }

    public int fruitPosition(String fruit) {
        return this.fruitList.indexOf(fruit);
    }

    public Collection<String> distinctFruits(List<String> fruitList) {
        return new HashSet<String>(fruitList);
    }

    public int fruitCount(List<String> fruitList) {
        return fruitList.size();
    }

    public int customCount(List<String> fruitList) {
        int count = 0;
        for (int i = 0; i < fruitList.size(); i++) {
            count++;
        }
        return count;
    }

    public List<String> getFruitList() {
        return fruitList;
    }

    @Override
    public String toString() {
        return "Basket { " +
                "fruitList = " + fruitList +
                '}';
    }
}
