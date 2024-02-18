package Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommnd(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
