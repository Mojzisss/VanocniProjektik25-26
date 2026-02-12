package game;

public class Character {
    private String name;
    private String id;
    private String role;
    private String position;

    public Character(String name, String id, String role, String position) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", role='" + role + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
