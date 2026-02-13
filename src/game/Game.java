package game;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

import commands.*;
public class Game {

//
    private Player player;
    private HashMap<String, Command> commands;
    static GameData world = GameData.loadGameDataFromResources("/map.json");
    private boolean isExit;

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
        gameLoop();


        //zde bude herni smycka
    }

    public void gameLoop(){
        System.out.println("nooo my husband just died ,god why? tell me whyy!");
        System.out.println("hmmm gods , gods taken him ,so gods can give him back ??");
        System.out.println("ohh by the way I am princess Theresia ");
        System.out.println("\"mumbling\" now you are basically me ,so enjoyy the journey. muhahajja");

        while (!isExit) {
            Scanner sc = new Scanner(System.in);

            String line = sc.nextLine().toLowerCase().trim();
            if (line.isEmpty()) {
                System.out.println("Command can't be empty");
                continue;
            }
            String command = line.split(" ")[0];
            if (commands.containsKey(command)) {
                System.out.println(commands.get(command).execute(line));
                isExit = commands.get(command).exit();
            } else {
                System.out.println("Unknown Command. if you don't know try \"Help\" ");
            }
        }
    }
}
