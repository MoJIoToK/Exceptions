package S3_HW;

import java.time.LocalDate;

/*
 * Данный класс служит для хранения данных пользователя, а его неизменяемая структура позволяет
 * использовать объекты `UserData` в различных частях программы и предоставлять доступ
 * только для чтения к данным пользователя.
 */

public class UserData {

    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate dateOfBirth;
    private long phone;
    private String gender;

    public UserData(String lastName, String firstName, String middleName,
            LocalDate dateOfBirth, long phone, String gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public long getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

}
