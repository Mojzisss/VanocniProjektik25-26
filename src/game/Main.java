package game;


public class Main {
    public static void main(String[] args) {
       GameData data = GameData.loadGameDataFromResources("/map.json");



//        System.out.println("Items: " + Game.world.items);
//        System.out.println("Characters: "+ Game.world.characters);
//        System.out.println("Locations: " + Game.world.rooms);
//        System.out.println("Quests: " + Game.world.quests);

        Game game = new Game();
        game.start();

    }
}