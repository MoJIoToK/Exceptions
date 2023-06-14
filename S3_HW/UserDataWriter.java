package S3_HW;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

/*
 * `UserDataWriter` - класс необходимый для записи данных пользователя в файл. 
 * В класс содержится метод `writeUserData()`, принимает объект `UserData`. 
 * Пользователю предлагается ввести имя файла, в который будут записаны данные.
 * Далее создаётся объект `FileWriter` для указанного файла и записываются данные в форматированном виде. 
 * Файл закрывается с помощью try-with-resources. В случае возникновения ошибок ввода-вывода
 * выбрасывается исключение `IOException`. После успешной записи данных выводится сообщение об
 * успешной операции.
 */

public class UserDataWriter {

    public void writeUserData(UserData userData) {
        String fileName = "S3_HW/bd/" + userData.getLastName();
        String userDataString = String.join(" ",
                userData.getLastName(),
                userData.getFirstName(),
                userData.getMiddleName(),
                userData.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                String.valueOf(userData.getPhone()),
                userData.getGender().toString());

        try (FileWriter writer = new FileWriter(fileName, true);) {
            writer.write(userDataString + "\n");
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }

        System.out.println("Данные успешно записаны в файл: " + fileName);
    }

}
