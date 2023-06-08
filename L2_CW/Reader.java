import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.management.RuntimeErrorException;

public class Reader {
    
    public static void main(String[] args) {
        FileReader test = null;
        try{
            test = new FileReader("TryCatch.java");
            //test.read();
        }catch(RuntimeException | IOException e){
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finaly start");
            if(test != null){
                try {
                    test.close();
                }catch (IOException e){
                    System.out.println("exception while close");
                }
            }
            System.out.println("finaly finished!");

        }
           
    }
    
}
