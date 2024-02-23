package TemplateMethod;

public class Coffee extends CaffeineBeverage{
    void brew() {
        System.out.println("brew coffee");
    }

    void addCondiments() {
        System.out.println("add milk");
    }
}
