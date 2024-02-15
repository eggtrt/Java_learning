package Factory;

public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals("Cheese"));
        return new ChicagoStyleCheesePizza();
    }
}