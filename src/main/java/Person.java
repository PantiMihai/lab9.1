import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Person {
    public String nume;
    public  int varsta;
    public Person(String nume , int varsta){
        this.nume=nume;
        this.varsta=varsta;
    }

}