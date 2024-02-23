package TemplateMethod;

public class Tea extends CaffeineBeverageWithHook{
    void brew() {
        System.out.println("brew tea");
    }

    void addCondiments() {
        System.out.println("add lemon");
    }
}
