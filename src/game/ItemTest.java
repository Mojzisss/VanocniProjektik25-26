package game;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    Item Item1;
    Item Item2;


    @org.junit.jupiter.api.BeforeEach
    void init(){
        Item1 = new Item("Soul","id_Soul","Usable","spawn house");
        Item2 = new Item("Piece of rainbow","id_Piece of rainbow","Currency","rainbow bridge");
    }

    @org.junit.jupiter.api.Test
    void getName(){ assertEquals("Soul",Item1.getName());
    }

    @org.junit.jupiter.api.Test
    void getId() {assertEquals("id_Soul",Item1.getId());
    }

    @Test
    void getType() {assertEquals("Usable",Item1.getType());
    }

    @Test
    void getDescription() {assertEquals("spawn house",Item1.getDescription());
    }
}