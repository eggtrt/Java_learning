package TemplateMethod;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling...");
    }

    void pourInCup() {
        System.out.println("Pour...");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
