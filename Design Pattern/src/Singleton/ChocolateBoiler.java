package Singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance() {
        if (uniqueBoiler == null) {
            uniqueBoiler = new ChocolateBoiler();
        }

        return uniqueBoiler;
    }
    private boolean isEmpty() {
        return empty;
    }

    private boolean isBoiled() {
        return boiled;
    }
    public void fill() {
        if (isEmpty() == true) {
            empty = false;
            boiled = false;
        } 
    }

    public void drain() {
        if (isEmpty() == false && isBoiled() == true) {
            empty = true;
        }
    }

    public void boil() {
        if (isEmpty() == false && isBoiled() == false) {
            boiled = true;
        }
    }
}
