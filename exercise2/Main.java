package exercise2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> flowers = new HashSet<>();
        flowers.add("roses");
        flowers.add("violets");
        Bouquet bouquet = new Bouquet(flowers);
        bouquet.addFlower("lilies");
        bouquet.addFlower("roses");
        bouquet.addFlower("tulips");
        bouquet.addFlower("violets");
        bouquet.removeFlower("lilies");
        System.out.println(bouquet.toString());
        Collection<String> all = bouquet.getAll();
        System.out.println(all.toString());
    }

}
