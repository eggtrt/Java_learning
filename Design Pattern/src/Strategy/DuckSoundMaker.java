package Strategy;
public class DuckSoundMaker {
    QuackBehavior quackBehavior;

    public void setQuackBehavior(QuackBehavior behavior) {
        quackBehavior = behavior;
    }

    public void display() {
        quackBehavior.quack();
    } 
}
