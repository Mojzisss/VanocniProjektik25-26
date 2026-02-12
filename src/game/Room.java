package game;

import java.util.ArrayList;

public class Room {

    private String name;
    private String id;
    private ArrayList<String> neighbours;
    private ArrayList<String> lootTable;

    public Room(String name,String id, ArrayList<String> neighbours, ArrayList<String> lootTable) {
        this.name = name;
        this.id = id;
        this.neighbours = neighbours;
        this.lootTable = lootTable;
    }

    public String getId()
        {return id;}

    public String getName()
        {return name;}

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", neighbors=" + neighbours +
                ", lootTable=" + lootTable +
                '}';
    }
}
