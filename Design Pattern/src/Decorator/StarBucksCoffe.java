package Decorator;

public class StarBucksCoffe {
    public static void main(String args) {
        Beverage beverage = new Espresso();

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
    }
}
