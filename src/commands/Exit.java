package commands;

public class Exit extends Command{
    @Override
    public String execute(String command) {
        return "";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
