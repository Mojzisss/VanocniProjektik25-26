import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
//        ObjectMapper parser = new ObjectMapper();
        GameData data = GameData.loadGameDataFromResources("/gamedata.json");


        System.out.println("Items: " + data.items.size());
        System.out.println("Characters: " + data.characters.size());
        System.out.println("Locations: " + data.locations.size());
        System.out.println("Quests: " + data.quests.size());

//        try{
//            InputStream input = new FileInputStream("resource/characters");
//            Character character =parser.readWalue(input , Character.class);
//            System.out.println(character);
//
//
//        }
   }
}