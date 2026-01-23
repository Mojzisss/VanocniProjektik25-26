package commands;

import game.Player;

public class Movement implements Command{

    private Player p;

    public Movement(Player p) {
        this.p = p;
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
