public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks can swim!");
    }

    public void setFlyBehavior(FlyBehavior behavior) {
        flyBehavior = behavior;
    }

    public void setQuackBehavior(QuackBehavior behavior) {
        quackBehavior = behavior;
    }
}
