package game;
import java.util.HashMap;
import commands.*;
public class Game {

    private GameData world;
    private Player player;
    private HashMap<String, Command> commands;
    public void inicialization(){
        commands = new HashMap<>();
        world = GameData.loadGameDataFromResources("/gamedata.json");
        //TODO pridat commands
        commands.put("pohyb", new Movement(player));

    }

    public void start(){
        inicialization();
        //zde bude herni smycka
    }
}
