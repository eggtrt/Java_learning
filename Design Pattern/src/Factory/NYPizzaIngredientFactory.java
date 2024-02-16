package Factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    public Cheese createCheese() {
        return new RegggianoCheese();
    }
    public Veggies[] createVeggies() {
        return new verggies();
    }
    public Pepperoni createPepperoni() {
        return new slicedPepperoni();
    }
    public Clam createClam() {
        return new FreshClams();
    }

}
