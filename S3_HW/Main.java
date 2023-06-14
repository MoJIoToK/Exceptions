package S3_HW;

import java.util.Scanner;

/*
 * Класс `Main` точкА входа в программу. В нём создаются экземпляры классов для чтения
 * пользовательского ввода и записи данных, а затем вызывается метод для обработки
 * пользовательских данных и записи их в файл.
 */

public class Main {

  public static void main(String[] args) throws CheckException {

    Scanner scanner = new Scanner(System.in);

    try {
      Reader inputReader = new Reader(scanner);
      UserDataWriter fileWriter = new UserDataWriter();
      UserData userData = inputReader.readUserData();
      fileWriter.writeUserData(userData);
    } catch (CheckException e) {
      
      System.out.println("Ошибка: " + e.getMessage());
    }

  }

}
