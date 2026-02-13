package game;
import java.util.HashMap;
import commands.*;
public class Game {

    private GameData data;
    private Player player;
    private HashMap<String, Command> commands;
    static GameData world = GameData.loadGameDataFromResources("/map.json");

    public void inicialization(){
        commands = new HashMap<>();

        commands.put("movement", new Movement(player));
        commands.put("dialog", new Dialog());
        commands.put("fight", new Fight());
        commands.put("pickup", new Pickup());
        commands.put("quests", new Quests());
        commands.put("usage", new Usage());
        commands.put("Help", new Help());
        commands.put("Exit", new Exit());



    }

    @Override
    public String toString() {
        return "commands=" + commands;
    }

    public void start(){
        inicialization();
        System.out.println(commands.toString());
        System.out.println("nooo my husband just died ,god why? tell me whyy!");
        System.out.println("hmmm gods , gods taken him ,so gods can give him back ??");
        //zde bude herni smycka
    }
}
