package Factory;

public class PizzaTestDrive {
    public static void main(String args[]) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("NY Cheese Pizza" + pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Chicago Cheese Pizza" + pizza.getName());
    }
}
