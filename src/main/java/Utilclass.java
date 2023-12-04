import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utilclass {
    public static void main(String[] args) throws IOException{
        Person person1 =new Person("Alex", 20);
        Person person2 =new Person("Alehandro", 30);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("C:\\Users\\cti22b213\\person.json"), person1);
        objectMapper.writeValue(new File("C:\\Users\\cti22b213\\person.json"), person2);

    }
}
