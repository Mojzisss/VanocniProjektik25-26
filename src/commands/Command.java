package commands;

public abstract class Command {

    protected String command;

    public void setCommand(String prikaz) {
        this.command = prikaz;
    }

    public abstract String execute(String command);

    public abstract boolean exit();
}
