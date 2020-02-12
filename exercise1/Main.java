package exercise1;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addFruit("banana");
        basket.addFruit("strawberry");
        basket.addFruit("watermelon");
        basket.addFruit("peach");
        basket.addFruit("apple");
        basket.addFruit("banana");
        basket.addFruit("cherry");
        basket.addFruit("apple");
        basket.addFruit("pineapple");
        System.out.println(basket.getFruitList());
        System.out.println(basket.findFruit("cherry"));
        basket.removeFruit("watermelon");
        System.out.println(basket.getFruitList());
        System.out.println(basket.fruitPosition("cherry"));
        System.out.println(basket.distinctFruits(basket.getFruitList()));
        System.out.println(basket.fruitCount(basket.getFruitList()));
        System.out.println(basket.customCount(basket.getFruitList()));
    }
}
