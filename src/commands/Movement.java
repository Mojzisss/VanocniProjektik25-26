package commands;

import game.Player;

public class Movement extends Command {

    private Player p;

    public Movement(Player p) {
        this.p = p;
    }

    @Override
    public void setCommand(String prikaz) {

    }

    @Override
    public String execute(String command) {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
