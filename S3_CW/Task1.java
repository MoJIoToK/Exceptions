package S3_CW;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task1 {
    public void rwLine(Path pathRead, Path pathWrite) throws IOException {
        // BufferedReader in = null;
        // BufferedWriter out = null;

        try (BufferedReader in = Files.newBufferedReader(pathRead);
            BufferedWriter out = Files.newBufferedWriter(pathWrite)) {

            out.write(in.readLine());
        }
    }
}

/*
 * public void rwLine(Path pathRead, Path pathWrite) throws IOException{
 * BufferedReader in = null;
 * BufferedWriter out = null;
 * try {
 * in = Files.newBufferedReader(pathRead);
 * out = Files.newBufferedWriter(pathWrite);
 * out.write(in.readLine());
 * } finally {
 * try {
 * if (in != null){
 * in.close();
 * }
 * } catch (IOException e){
 * 
 * }
 * try {
 * if (out != null){
 * out.close();
 * }
 * } catch (IOException e){
 * 
 * }
 * }
 * }
 */
