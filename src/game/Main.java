package game;


public class Main {
    public static void main(String[] args) {
       GameData data = GameData.loadGameDataFromResources("/map.json");



        System.out.println("Items: " + data.items);
        System.out.println("Characters: " + data.characters);
        System.out.println("Locations: " + data.rooms);
        System.out.println("Quests: " + data.quests);

        Game game = new Game();
        game.start();

   }
}