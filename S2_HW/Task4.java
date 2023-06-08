package S2_HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Разработайте программу, которая выбросит Exception, 
 * когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, 
 * что пустые строки вводить нельзя. 
 * Далее запросить повторный ввод строки
 */

public class Task4 {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        try (BufferedReader textReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                try {
                    System.out.println("Введите строку");
                    String line = getText(textReader);
                    System.out.println(line);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Возникла ошибка при работе с консолью");
        }
    }

    public static String getText(BufferedReader textReader) throws IOException {
        String line = textReader.readLine();

        if (line.isEmpty()) {
            throw new RuntimeException("Введена пустая строка");
        }
        return line;
    }

}
