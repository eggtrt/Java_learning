package Factory;

public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals("Cheese"));
        return new NYStyleCheesePizza();
    }
}