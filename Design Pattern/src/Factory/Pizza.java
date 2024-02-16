package Factory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    
    ArrayList topping = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing" + name);
    }

    void bake() {
        System.out.println("baking");
    }

    void cut() {
        System.out.println("Cutting");
    }

    void box() {
        System.out.println("Add box");
    }

    public String getName() {
        return name;
    }
}
