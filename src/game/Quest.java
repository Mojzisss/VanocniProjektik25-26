package game;

import java.util.ArrayList;

public class Quest {
    private String name;
    private String id;
    private String position;
    private String description;
    private String status;

    public Quest(String name, String id, String position, String description, String status) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.description = description;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Quest{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", position='" + position + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
