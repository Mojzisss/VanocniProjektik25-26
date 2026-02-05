package game;


public class Main {
    public static void main(String[] args) {
       GameData data = GameData.loadGameDataFromResources("/map.json");



//        System.out.println("Items: " + data.items.size());
//        System.out.println("Characters: " + data.characters.size());
        System.out.println("Locations: " + data.rooms);
//        System.out.println("Quests: " + data.quests.size());

        Game game = new Game();
        game.start();

   }
}