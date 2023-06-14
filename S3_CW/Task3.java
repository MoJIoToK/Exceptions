package S3_CW;

import java.io.IOException;

public class Task3 {

    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            counter.add();
            counter.add();
            System.out.println("считаю");
            System.out.println(counter.getCount());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Конец блока try-catch");
    }
}
