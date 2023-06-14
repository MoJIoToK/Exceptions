package S3_HW;

import java.time.LocalDate;
import java.util.Scanner;

/*
 * `Reader` - класс, который благодаря `Scanner` читает пользовательский ввод с консоли. 
 * В классе содержится метод `readUserData()`, который приглашает пользователя ко вводу данных
 * в определенном порядке, разделяя их пробелом. 
 * После метод разбивает введенные данные на составляющие и проверяет сколько данных было введено.
 * Далее данные отправляются на проверку и в случае корректности всех данных, создается и 
 * возвращается объект `UserData`.
 */

public class Reader {
    private Scanner scanner;

    public Reader(Scanner scanner) {
        this.scanner = scanner;
    }

    public UserData readUserData() throws CheckException {

        while (true) {
            System.out.println("Введите через ПРОБЕЛ ФИО, дату рождения в формате(ДД.ММ.ГГГГ), телефон(без разделителей), пол(m/f) : ");

            String inputText = scanner.nextLine();
            String[] dataUser = inputText.split(" ");

            if (dataUser.length == 6) {
                LocalDate dateOfBirth = Check.checkDateOfBirth(dataUser[3]);
                long phonenumber = Check.checkPhoneNumber(dataUser[4]);
                String gender = Check.checkGender(dataUser[5]);
                return new UserData(dataUser[0], dataUser[1], dataUser[2], dateOfBirth, phonenumber,
                        gender);
            } else if (dataUser.length > 6) {
                System.out.println("Вы ввели лишние данные. Пожалуйста, повторите попытку:");
            } else
                System.out.println("Вы ввели не все данные. Пожалуйста, повторите попытку:");
        }

    }

}
