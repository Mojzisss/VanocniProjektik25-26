package game;

import java.util.ArrayList;

public class Room {

    private String id;
    private String name;
    private String description;
    private ArrayList<String> neighbours;
    private ArrayList<String> lootTable;



    public String getId()
        {return id;}

    public String getName()
        {return name;}

    @Override
    public String toString() {
        return "Location{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", neighbors=" + neighbours +
                ", lootTable=" + lootTable +
                '}';
    }
}
