package game;

public class Item {

    private String name;
    private String id;
    private String type;
    private String description;

    public Item(String name,String id, String type, String description) {

        this.name = name;
        this.id = id;
        this.type = type;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", position='" + description + '\'' +
                '}';
    }
}
