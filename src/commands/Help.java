package commands;

public class Help extends Command{
    @Override
    public String execute(String command) {
        return "Dialog , Fight , Movement , Pickup, Quests ";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
