package commands;

public class Help extends Command{
    @Override
    public String execute(String command) {
        return String.join("\n",
                "Available Commands:",
                " - Help                : shows this Help",
                " - Exit                : end the game",
                " - Movement            : tells you where you do stand and asks where do you want to move ",
                " - Dialog              : when in location with NPC , they can talk with u",
                " - Fight               : u can try, but u have surely no chance to suceed",
                " - Pickup              : Pick up everything on the ground",
                " - Quests              : shows available quests",
                " - Usage               : tells if u can use some item"
        );
    }

    @Override
    public boolean exit() {
        return false;
    }
}
