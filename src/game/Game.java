package game;
import java.util.HashMap;
import commands.*;
public class Game {

    private GameData data;
    private Player player;
    private HashMap<String, Command> commands;

    public void inicialization(){
        commands = new HashMap<>();
      //  world = GameData.loadGameDataFromResources("/map.json");
        commands.put("pohyb", new Movement(player));
        commands.put("dialog", new Dialog());
        commands.put("fight", new Fight());
        commands.put("pickup", new Pickup());
        commands.put("quests", new Quests());
        commands.put("usage", new Usage());



    }

    public void start(){
        inicialization();
        //zde bude herni smycka
    }
}
