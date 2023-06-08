package L3_CW;

import java.io.FileWriter;
import java.io.IOException;

public class SaveService {

    public void save() {
        System.out.println("Save document started!");
        try (FileWriter write = new FileWriter("Application Save.txt")) {
            throw new IOException("Operation failed!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
