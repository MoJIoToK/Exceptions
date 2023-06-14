package S3_HW;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Класс `Check` служит для проверки корректности данных. Проверка даты рождения, номера телефона и пола.
 * Если данные корректны, то они возвращаются в класс `Reader`. В противном случае, пользователь увидит 
 * ошибку `CheckException`.
 */

public class Check {

    public static LocalDate checkDateOfBirth(String dateOfBirth) throws CheckException {
        try {
            return LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (Exception e) {
            throw new CheckException("Неверный формат даты рождения");
        }
    }

    public static Long checkPhoneNumber(String phoneNumber) throws CheckException {
        try {
            return Long.parseLong(phoneNumber);
        } catch (NumberFormatException e) {
            throw new CheckException("Неверный формат номера телефона");
        }
    }

    public static String checkGender(String gender) throws CheckException {
        if (gender.equals("m") || gender.equals("f")) {
            return gender;
        } else {
            throw new CheckException("Неверный формат пола!");
        }
    }

}
