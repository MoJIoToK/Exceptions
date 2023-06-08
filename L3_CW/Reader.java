package L3_CW;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.management.RuntimeErrorException;

public class Reader {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("L3_CW/testov.txt");
                FileWriter writer = new FileWriter("L3_CW/newTest.txt")) {
            while (reader.ready()) {
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } 
        System.out.println("Copy succesfully!");

    }

}
