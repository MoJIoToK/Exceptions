package S2_HW;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        showDigit();
    }

    public static void showDigit() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите число: ");

            String line = scanner.nextLine();
            float number;
            if (line.matches("[0-9]+")) {
                number = Float.parseFloat(line);
                System.out.println(number);
            } else {
                System.out.println("Число введено некорректно! Повторите попытку");
            }
        }
    }

}
