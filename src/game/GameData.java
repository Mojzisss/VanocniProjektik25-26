package game;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

    /**
     * Represents the game data loaded from a JSON file.
     * This class serves as a data container for all static game content, such as items, characters, locations, and quests.
     *
     */
    public class GameData {

        public ArrayList<Item> items;
        public ArrayList<Character> characters;
        public ArrayList<Room> rooms;
        public ArrayList<Quest> quests;
       // game.GameData data = game.GameData.loadGameDataFromResources("/map.json");

        /**
         * Loads game data from a JSON file.
         * @param resourcePath path to the resource file
         * @return a game.GameData object filled with the loaded data
         */
        public static GameData loadGameDataFromResources(String resourcePath) {
            //Vytvoření objektu pro práci s JSON souborem
            Gson gson = new Gson();

            //Načtení souboru gamedata.json, musí být ve složce res/resources, ta musí být označena jako resource složka projektu
            try (InputStream is = GameData.class.getResourceAsStream(resourcePath)) {

                //Zde ověřujeme, zdali soubor existuje
                if (is == null) {
                    throw new IllegalStateException("Nenalezen resource: " + resourcePath +
                            " (zkontrolujte, že soubor je v src/main/resources).");
                }

                //Přečte celý JSON a vytvoří instanci game.GameData, naplní vlastnosti podle názvů klíčů v JSONU, vrátí se hotová třída game.GameData
                return gson.fromJson(
                        new InputStreamReader(is, StandardCharsets.UTF_8),
                        GameData.class
                );

            } catch (Exception e) {
                throw new RuntimeException("Chyba při načítání JSON: " + e.getMessage());
            }

        }

        /**
         * Finds a specific location by its identifier.
         * @param id the identifier of the location to be found
         * @return the matching location
         */
        public  Room findLocation(String id) {
            for (Room l : rooms) {
                if (l.getId().equals(id)){
                    return l;
                }
            }
            throw new IllegalArgumentException("Neexistuje lokace s id: " + id);
        }


    }
