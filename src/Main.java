import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        ObjectMapper parser = new ObjectMapper();

        try{
            InputStream input = new FileInputStream("resource/characters");
            Character character =parser.readWalue(input , Character.class);
            System.out.println(character);


        }
   }
}